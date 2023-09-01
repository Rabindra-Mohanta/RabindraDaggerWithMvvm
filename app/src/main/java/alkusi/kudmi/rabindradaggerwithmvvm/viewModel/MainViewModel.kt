package alkusi.kudmi.rabindradaggerwithmvvm.viewModel

import alkusi.kudmi.rabindradaggerwithmvvm.model.Products
import alkusi.kudmi.rabindradaggerwithmvvm.repository.MyRepository
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MainViewModel(private val myRepository: MyRepository): ViewModel() {
    val productList: LiveData<List<Products>>
    get() = myRepository.liveData

    init {
        viewModelScope.launch {
            myRepository.getData()
        }
    }
}