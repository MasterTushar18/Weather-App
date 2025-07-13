document.addEventListener("DOMContentLoaded", function () {
  document.getElementById("getWeatherBtn").addEventListener("click", fetchWeather);
});

async function fetchWeather() {
  const city = document.getElementById('cityInput').value;

  if (!city) {
    alert("Please enter a city.");
    return;
  }

  try {
    const res = await fetch(`/api/weather?city=${encodeURIComponent(city)}`);
    if (!res.ok) throw new Error("Network error");

    const data = await res.json();
    const weather = data.current;

    document.getElementById('weatherData').innerHTML = `
      <h3>${data.location.name}, ${data.location.country}</h3>
      <img src="${weather.weather_icons[0]}" alt="weather icon" />
      <p><strong>${weather.weather_descriptions[0]}</strong></p>
      <p>🌡️ Temp: ${weather.temperature}°C | 💧 Humidity: ${weather.humidity}%</p>
      <p>💨 Wind: ${weather.wind_speed} km/h ${weather.wind_dir}</p>
    `;
  } catch (error) {
    console.error("Failed to fetch weather data:", error);
    document.getElementById('weatherData').innerHTML = `<p style="color:red;">Unable to fetch data.</p>`;
  }
}