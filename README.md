# Weather Now 🌤️

A modern, visually appealing Android Weather Application developed in **Kotlin** using **Jetpack Compose**. It provides precise current weather conditions and hourly forecasts by fetching real-time data based on the user's location.

The project is structured with **Clean Architecture** principles and implements the **MVVM** (Model-View-ViewModel) pattern to ensure scalability, maintainability, and testing capabilities. 

## ✨ Features

- **Current Weather**: Displays accurate current weather, including temperature, weather conditions, humidity, pressure, and wind speed.
- **Hourly Forecast**: See the weather trends and temperatures for the rest of the day.
- **Location-based Tracking**: Automatically fetches weather data based on the device's current location using the Fused Location Provider.
- **Search Capabilities**: Find the weather for different locations using the built-in search bar.
- **Modern UI**: Fully built with **Jetpack Compose** matching a clean and dynamic UI/UX design.

## 🛠 Tech Stack & Services

- **Language**: [Kotlin](https://kotlinlang.org/)
- **UI Toolkit**: [Jetpack Compose](https://developer.android.com/jetpack/compose) for a declarative UI.
- **Architecture**: **Clean Architecture** (Data, Domain, Presentation layers) combined with **MVVM**.
- **Dependency Injection**: [Dagger Hilt](https://dagger.dev/hilt/) for robust DI.
- **Networking**: [Retrofit 2](https://square.github.io/retrofit/) for REST API calls. 
- **JSON Serialization & Parsing**: [Moshi](https://github.com/square/moshi).
- **Asynchronous Operations**: [Kotlin Coroutines](https://kotlinlang.org/docs/coroutines-overview.html) for background tasks and asynchronous flows.
- **Location Services**: Google Play Services (Fused Location Provider) logic to get accurate coordinates continuously.
- **Weather API**: [Open-Meteo](https://open-meteo.com/), a high-performance open-source weather API (requires no API key).

## 🏗 Architecture Overview

The app follows Clean Architecture principles allowing changes to be independent of each other:

- **Presentation Layer**: Contains the UI (`MainActivity` and Composable components like `WeatherCard`, `HourlyWeatherDisplay`, `Search_Bar`) and the `WeatherViewModel` reacting to state changes (`WeatherState`).
- **Domain Layer**: Holds standard business logic and models. Uses repository interfaces enabling decoupling.
- **Data Layer**: Contains actual implementations of repositories, DTOs (`WeatherDto`, `WeatherDataDto`), and network interactions (`WeatherAPI`).
- **DI Core**: Dedicated DI package configuring singletons and scoped instances (e.g., Repositories, APIs) using Dagger Hilt.

## 🚀 Getting Started

### Prerequisites

- Android Studio Koala (or newer) supporting Compose.
- Android device or Emulator running Android API Level 27+.

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/Tarun-sharma05/Weather-Now.git
   ```
2. Open the project in Android Studio.
3. Build the project and let Gradle sync all dependencies.
4. Make sure location services are enabled on your test device for the functionality to work.
5. Hit "Run".

## 🙏 Acknowledgements

- Provided by the open source Weather data from [Open-Meteo API](https://open-meteo.com/).
