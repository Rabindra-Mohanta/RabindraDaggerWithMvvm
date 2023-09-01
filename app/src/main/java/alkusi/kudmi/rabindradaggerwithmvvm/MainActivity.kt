package alkusi.kudmi.rabindradaggerwithmvvm

import alkusi.kudmi.rabindradaggerwithmvvm.viewModel.MainViewModel
import alkusi.kudmi.rabindradaggerwithmvvm.viewModel.MainViewModelFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    lateinit var mainViewModel: MainViewModel;
    @Inject
    lateinit var mainViewModelFactory: MainViewModelFactory
    val text:TextView
    get() = findViewById(R.id.text)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        (application as ComponentApplication).productComponent.initDagger(this)
        mainViewModel = ViewModelProvider(this,mainViewModelFactory).get(MainViewModel::class.java)

                                                                                                      
  mainViewModel.productList.observe(this, Observer {
      text.text =  it.joinToString { x ->x.description+"\n\n"
      }
      Log.e("rabindra","rabindra->"+text.text.toString())

  })
    }
}