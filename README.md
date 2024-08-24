# Fancy Gallery - Android Application

Fancy Gallery is a sophisticated Android app that downloads and displays curated images from Flickr using its API. Users can toggle between viewing images in a scrolling grid or on a world map, with the option to click on any image to view its details on Flickr.

## Key Features
- **Bottom Navigation Bar**: Provides seamless navigation between different app views.
- **REST API Integration**: Makes HTTPS requests to fetch images from Flickr and deserialize JSON into Kotlin objects.
- **Image Grid**: Displays images in a scrolling grid using a RecyclerView, with network images loaded efficiently.
- **Map View**: Displays images on a world map based on embedded geo-coordinates, allowing users to pan and zoom the map.
- **Interactive Map Markers**: Places custom markers on the map, with user interaction handling for viewing image details.
- **WebView Integration**: Displays HTML content and Flickr pages, with a progress bar indicating loading status.
- **Image Caching**: Refreshes the cache of loaded images on demand to ensure up-to-date content.
- **Fragment Communication**: Shares data seamlessly across two distinct fragments for a cohesive user experience.

## How to Use
1. **Navigate the App**: Use the bottom navigation bar to toggle between the grid view and the map view.
2. **Explore Images**: Scroll through the grid or explore the map to find interesting images.
3. **View Details**: Click on any image to view its corresponding Flickr page within the app’s WebView.
4. **Interact with Map Markers**: Tap on markers to explore images based on their geographic location.

Fancy Gallery offers a blend of powerful features and a user-friendly interface for exploring and interacting with curated images from around the world.


