# 🌤️ Weather App 🌤️

### ✨ About

A simple Spring Boot application that provides current weather information for a given city. The app fetches weather data from an external API and displays it via a RESTful endpoint and a user-friendly web interface.

## 📝 Features

- Search for current weather by city name
- REST API endpoint for weather data
- Responsive web UI (HTML, CSS, JavaScript)
- Logging for API requests
- Unit and integration tests

## 🛠️ Technologies Used

- Java 17+
- Spring Boot
- Spring Web
- Lombok
- JUnit 5
- Maven

## 🚀 Getting Started

### Prerequisites
- Java 17 or higher
- Maven

### ▶️ Running the Application

1. **Clone the repository:**
   ```bash
   git clone <repository-url>
   cd Weather-App
   ```
2. **Configure API Key:**
   - Set your weather API key in `src/main/resources/application.yml` if required.
3. **Build and run:**
   ```bash
   mvn spring-boot:run
   ```
4. **Access the app:**
   - Open [http://localhost:8080](http://localhost:8080) in your browser.

### 🔎 API Usage

- **Endpoint:** `/api/weather`
- **Method:** GET
- **Query Parameter:** `city` (e.g., `?city=London`)
- **Example:**
  ```http
  GET http://localhost:8080/api/weather?city=London
  ```
- **Response:**
  ```json
  {
    "location": { ... },
    "current": { ... },
    "request": { ... }
  }
  ```

## 🗂️ Project Structure

```
src/
  main/
    java/com/tushar/weather/
      controller/         # REST controllers
      model/              # Data models
      service/            # Service layer
    resources/
      static/             # Frontend assets (HTML, CSS, JS)
      templates/          # (If using Thymeleaf or similar)
  test/
    java/com/tushar/weather/
      controller/         # Controller tests
      service/            # Service tests
```


## 📃 License

This project is licensed under the MIT License.

---

**Author✍🏻:** Tushar