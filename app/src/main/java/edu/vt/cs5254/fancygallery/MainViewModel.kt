package edu.vt.cs5254.fancygallery

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class MainViewModel : ViewModel(){

    private val photoRepository = PhotoRepository()

    private val _galleryItems: MutableStateFlow<List<GalleryItem>> = MutableStateFlow(emptyList())
    val galleryItems = _galleryItems.asStateFlow()

    init {
        viewModelScope.launch {
            _galleryItems.value = loadPhotos()
        }
    }

    fun reloadGalleryItems() {
        viewModelScope.launch {
            _galleryItems.value = emptyList()
            _galleryItems.update {
                loadPhotos()
            }
        }
    }

    private suspend fun loadPhotos(): List<GalleryItem> {
        return try {
            val items = photoRepository.fetchPhotos(99)
            items
        } catch (ex: Exception) {
            emptyList()
        }
    }

}