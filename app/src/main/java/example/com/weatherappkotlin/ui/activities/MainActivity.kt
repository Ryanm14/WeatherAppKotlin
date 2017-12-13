package example.com.weatherappkotlin.ui.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import example.com.weatherappkotlin.R
import example.com.weatherappkotlin.domain.commands.RequestForecastCommand
import example.com.weatherappkotlin.ui.adapters.ForecastListAdapter
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.find
import org.jetbrains.anko.uiThread

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val forcastList: RecyclerView = find(R.id.forcast_list)
        forcastList.layoutManager = LinearLayoutManager(this)
        doAsync {
            val result = RequestForecastCommand("94043").execute()

            uiThread {
                forcastList.adapter = ForecastListAdapter(result)
            }
        }

    }


}


