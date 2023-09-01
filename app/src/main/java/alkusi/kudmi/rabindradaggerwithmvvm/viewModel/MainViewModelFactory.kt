package alkusi.kudmi.rabindradaggerwithmvvm.viewModel

import alkusi.kudmi.rabindradaggerwithmvvm.repository.MyRepository
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject

class MainViewModelFactory @Inject constructor(private val myRepository: MyRepository):ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(myRepository) as T;
    }
}