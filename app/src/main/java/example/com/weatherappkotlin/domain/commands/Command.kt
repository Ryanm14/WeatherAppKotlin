package example.com.weatherappkotlin.domain.commands

/**
 * Created by ryan on 11/15/17.
 */
interface Command<out T> {
    fun execute(): T
}