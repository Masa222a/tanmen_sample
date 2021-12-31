package android.tanmen.ui.shuffle

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ShuffleViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is shuffle Fragment"
    }
    val text: LiveData<String> = _text
}