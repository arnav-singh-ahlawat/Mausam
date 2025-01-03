# Mausam - Android Weather App

![#USER-INTERFACE](https://github.com/user-attachments/assets/d9a582e7-e822-4b45-a2ef-afe20b58885c)

## Overview:

Mausam is a sleek, real-time weather application built using Kotlin and XML in Android Studio. The app leverages GPS-based location services and manual location inputs to provide accurate and up-to-date weather information, making it your perfect companion for planning your day.

## Video Demo:

https://github.com/user-attachments/assets/c8c6495c-fdf5-4b4f-8167-b1ca525eaec0

## Features:

**Real-Time Weathe Updates:** Get live weather data, including temperature, humidity, and precipitation details.

**Location-Based Services:** Automatically fetch weather information for your current GPS location.

**Manual Location Input:** Search for and view weather data for any location worldwide.

**Intuitive User Interface:** Designed with XML for a clean and user-friendly experience.

**Reliable Weather Data:** Powered by 'WeatherAPI' for accurate and timely updates.

## Getting Started:

**Prerequisites:** Have Android Studio installed on your system.

Clone the repository by using the git command - "git clone https://github.com/arnav-singh-ahlawat/Mausam.git" in your project directory.

**Adding WeatherAPI key (optional):** You can add your own WeatherAPI key by navigating to "Mausam/app/src/main/java/com/example/mausam/network/api/WeatherAPI.kt" in the project directory and pasting your API key at [const val API_KEY = "YOUR_API_KEY_HERE"].

Build the project using Gradle by running the command - "./gradlew build" in the terminal.


## Run the App:

The app can be run either on an emulator (suggested) or a connected Android device.

## Usage:

**GPS Weather:** Enable location services on your device, and Mausam will fetch weather updates for your current location.

**Manual Location Search:** Type in the name of a city or location to view weather details for that area.

**View Weatber Details:** Access information on temperature, humidity, and precipitation all in one screen.
 
## Tech Stack:

**Language (Backend Logic):** Kotlin

**UI/UX Design:** XML

**Development Environment:** Android Studio

**API Integration:** WeatherAPI

**Build and Testing:** Gradle

## Future Enhancements:

**Hourly Forecasts:** Add support for hourly weather updates.

**Weather Alerts:** Notify users of extreme weather conditions like storms or heatwaves.

**Theming Options:** Allow users to switch between light and dark themes.

**Multiple Language Support:** Provide weather updates in multiple languages.

## Acknowledgements:

**WeatherAPI:** For providing reliable weather data.

**Android Studio:** For the development platform.

**Kotlin:** For being the backbone of the app’s logic.

**Gradle:** For streamlined building and testing processes.