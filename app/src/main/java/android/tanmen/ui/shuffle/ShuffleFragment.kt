package android.tanmen.ui.shuffle

import android.os.Bundle
import android.tanmen.databinding.FragmentShuffleBinding
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider


class ShuffleFragment : Fragment() {

    private lateinit var shuffleViewModel: ShuffleViewModel
    private var _binding: FragmentShuffleBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        shuffleViewModel =
            ViewModelProvider(this).get(ShuffleViewModel::class.java)

        _binding = FragmentShuffleBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.shopName
        shuffleViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}