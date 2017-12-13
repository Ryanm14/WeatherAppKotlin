package example.com.weatherappkotlin.domain.model

/**
 * Created by ryan on 11/15/17.
 */

data class ForecastList(val city: String, val country: String, val dailyForecast: List<Forecast>)
data class Forecast(val date: String, val description: String, val high: Int, val low: Int)