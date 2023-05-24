package com.example.townsqktacademy.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.townsqktacademy.R
import com.example.townsqktacademy.data.Unit
import com.example.townsqktacademy.ui.components.UnitAdapter

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private var goto: Button? = null

    private var units: RecyclerView? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViews()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        return view
    }

    private fun setupViews() {
        goto = view?.findViewById(R.id.next)
        goto?.setOnClickListener {
            gotoOnClick()
        }

        units = view?.findViewById(R.id.units)

        units?.layoutManager = LinearLayoutManager(this.context, RecyclerView.VERTICAL, false)
        units?.adapter = UnitAdapter(populateCards())
    }

    private fun populateCards(): MutableList<Unit> {
        return mutableListOf(
            Unit(id = "DASGYDDHSAYGFSAGY"
                , title = "First Unit"
                , description = "This is the first unit card"
                , imageSource = "https://www.pockettactics.com/wp-content/sites/pockettactics/2021/11/minecraft-houses.jpg"
            ),
            Unit(id = "FASASFASDASDSAD"
                , title = "Second Unit"
                , description = "This is the second unit card"
                , imageSource = "https://www.pockettactics.com/wp-content/sites/pockettactics/2021/11/minecraft-houses.jpg"
            ),
            Unit(id = "QRWEQWFASFDASDFSA"
                , title = "Third Unit"
                , description = "This is the third unit card"
                , imageSource = "https://www.pockettactics.com/wp-content/sites/pockettactics/2021/11/minecraft-houses.jpg"
            ),
            Unit(id = "QWRASFAGDSGAFASF"
                , title = "Fourth Unit"
                , description = "This is the fourth unit card"
                , imageSource = "https://www.pockettactics.com/wp-content/sites/pockettactics/2021/11/minecraft-houses.jpg"
            ),
            Unit(id = "GDAGDSFASFDASFAS"
                , title = "Fifty Unit"
                , description = "This is the fifty unit card"
                , imageSource = "https://www.pockettactics.com/wp-content/sites/pockettactics/2021/11/minecraft-houses.jpg"
            ),
            Unit(id = "AGDAGDAGASDASFWQEQWE"
                , title = "Sixty Unit"
                , description = "This is the sixty unit card"
                , imageSource = "https://www.pockettactics.com/wp-content/sites/pockettactics/2021/11/minecraft-houses.jpg"
            ),
            Unit(id = "TQERQWRFTGASGFASFD"
                , title = "Seventy unit"
                , description = "This is the seventy unit card"
                , imageSource = "https://www.pockettactics.com/wp-content/sites/pockettactics/2021/11/minecraft-houses.jpg"
            ),
        )
    }

    private fun gotoOnClick() {
        findNavController().navigate(R.id.action_HomeFragment_to_DetailsFragment)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HomeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}