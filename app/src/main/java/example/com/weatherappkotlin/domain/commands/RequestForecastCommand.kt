package example.com.weatherappkotlin.domain.commands

import example.com.weatherappkotlin.data.ForecastRequest
import example.com.weatherappkotlin.domain.mappers.ForecastDataMapper
import example.com.weatherappkotlin.domain.model.ForecastList

/**
 * Created by ryan on 11/15/17.
 */
class RequestForecastCommand(private val zipCode: String) : Command<ForecastList> {
    override fun execute(): ForecastList {
        val forecastRequest = ForecastRequest(zipCode)
        return ForecastDataMapper().convertFromDataModel(forecastRequest.execute())
    }
}