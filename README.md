# Flixster

Flixster is an android movie listing app. One can view the movies that are playing and title and overview. 

Submitted by: Shravya Garlapati

Time spent: 10 hours spent in total

User Stories:

The following user stories must be completed:

* [X] User can view a list of movies (title, poster image, and overview) currently playing in theaters from the Movie Database API.
* [X] Lists should be fully optimized for performance with the ViewHolder pattern.
* [X] Views should be responsive for both landscape/portrait mode.
* [X] In portrait mode, the poster image, title, and movie overview is shown.
* [X] In landscape mode, the rotated layout should use the backdrop image instead and show the title and movie overview to the right of it.

The following advanced user stories are optional but recommended:
* [X] Add pull-to-refresh for popular stream with SwipeRefreshLayout (1 point)
* [X] Display a nice default placeholder graphic for each image during loading (read more about Picasso) (1 point)
* [X] Improve the user interface through styling and coloring (1 to 5 points depending on the difficulty of UI improvements)
* [X] For popular movies (i.e. a movie voted for more than 5 stars), the full backdrop image is displayed. Otherwise, a poster image, the movie title, and overview is listed. Use Heterogenous ListViews and use different ViewHolder layout files for popular movies and less popular ones. (2 points)

* [] Stretch: Expose details of movie (ratings using RatingBar, popularity, and synopsis) in a separate activity. (3 points)
* [] Stretch: Allow video posts to be played in full-screen using the YouTubePlayerView (2 points)
When clicking on a popular movie (i.e. a movie voted for more than 5 stars) the video should be played immediately.
Less popular videos rely on the detailed page should show an image preview that can initiate playing a YouTube video.
See the trailers API for video information. Here's a sample request.
* [] Stretch: Add a play icon overlay to popular movies to indicate that the movie can be played (1 point).
* [] Stretch: Leverage the data binding support module to bind data into one or more activity layout templates. (1 point)
* [] Stretch: Apply the popular ButterKnife annotation library to reduce view boilerplate. (1 point)
* [] Stretch: Add a rounded corners for the images using the Picasso transformations. (1 point)

## Video Walkthrough
Here's a walkthrough of the ToDo App:

<img src='http://i.imgur.com/yC8I5TE.gif' title='Flixster App Video Walkthrough' width='' alt='Flixster App Video Walkthrough' />

GIF created with [LiceCap](http://www.cockos.com/licecap/).

## License

    Copyright [2016] [Shravya Garlapati]

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

