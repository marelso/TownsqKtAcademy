package com.example.townsqktacademy.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.townsqktacademy.R
import com.example.townsqktacademy.data.CondoUnit
import com.example.townsqktacademy.ui.components.UnitAdapter
import com.example.townsqktacademy.ui.details.DetailsFragment

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

    private var units: RecyclerView? = null
    private var unitAdapter: UnitAdapter = UnitAdapter { condoUnit ->
        onUnitClick(condoUnit)
    }

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
        unitAdapter.setData(populateCards())
        units = view?.findViewById(R.id.units)
        units?.layoutManager = LinearLayoutManager(this.context, RecyclerView.VERTICAL, false)
        units?.adapter = unitAdapter
    }

    private fun onUnitClick(condoUnit: CondoUnit) {
        val param1 = "value1"
        val param2 = "value2"

        val destinationFragment = DetailsFragment.newInstance(param1, param2)

        findNavController().navigate(R.id.action_HomeFragment_to_DetailsFragment, destinationFragment.arguments)
    }

    private fun populateCards(): MutableList<CondoUnit> {
        return mutableListOf(
            CondoUnit(id = "DASGYDDHSAYGFSAGY"
                , title = "First Unit"
                , description = "This is the first unit card"
                , imageSource = "https://www.pockettactics.com/wp-content/sites/pockettactics/2021/11/minecraft-houses.jpg"
            ),
            CondoUnit(id = "FASASFASDASDSAD"
                , title = "Second Unit"
                , description = "This is the second unit card"
                , imageSource = "https://www.pockettactics.com/wp-content/sites/pockettactics/2021/11/minecraft-houses.jpg"
            ),
            CondoUnit(id = "QRWEQWFASFDASDFSA"
                , title = "Third Unit"
                , description = "This is the third unit card"
                , imageSource = "https://www.pockettactics.com/wp-content/sites/pockettactics/2021/11/minecraft-houses.jpg"
            ),
            CondoUnit(id = "QWRASFAGDSGAFASF"
                , title = "Fourth Unit"
                , description = "This is the fourth unit card"
                , imageSource = "https://www.pockettactics.com/wp-content/sites/pockettactics/2021/11/minecraft-houses.jpg"
            ),
            CondoUnit(id = "GDAGDSFASFDASFAS"
                , title = "Fifty Unit"
                , description = "This is the fifty unit card"
                , imageSource = "https://www.pockettactics.com/wp-content/sites/pockettactics/2021/11/minecraft-houses.jpg"
            ),
            CondoUnit(id = "AGDAGDAGASDASFWQEQWE"
                , title = "Sixty Unit"
                , description = "This is the sixty unit card"
                , imageSource = "https://www.pockettactics.com/wp-content/sites/pockettactics/2021/11/minecraft-houses.jpg"
            ),
            CondoUnit(id = "TQERQWRFTGASGFASFD"
                , title = "Seventy unit"
                , description = "This is the seventy unit card"
                , imageSource = "https://www.pockettactics.com/wp-content/sites/pockettactics/2021/11/minecraft-houses.jpg"
            ),
        )
    }

    private fun gotoOnClick() {
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