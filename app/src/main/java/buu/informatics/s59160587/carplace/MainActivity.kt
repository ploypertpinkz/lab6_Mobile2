package buu.informatics.s59160587.carplace

import android.content.Context
import android.databinding.DataBindingUtil
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.navigation.findNavController
import buu.informatics.s59160587.carplace.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    //biding data
    private lateinit var binding: ActivityMainBinding

    //carClass
    private val carPage: CarClass = CarClass("Car Park")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        //Back Button
//        val navController = this.findNavController(R.id.mainActivity)
//        NavigationUI.setupActionBarWithNavController(this,navController)

        binding.apply {
            carOneButton.setOnClickListener {
                    addCarOne()
            }

            carTwoButton.setOnClickListener {
                addCarTwo()
            }

            carThreeButton.setOnClickListener {
                addCarThree()
            }

            updateOneButton.setOnClickListener {
                updateCarOne(it)
            }

            updateTwoButton.setOnClickListener {
                updateCarTwo(it)
            }

            updateThreeButton.setOnClickListener {
                updateCarThree(it)
            }

            deleteOneButton.setOnClickListener {
                deleteCarOne()
            }

            deleteTwoButton.setOnClickListener {
                deleteCarTwo()
            }

            deleteThreeButton.setOnClickListener {
                deleteCarThree()
            }
        }

        binding.carPage = carPage
    }

//    override fun onSupportNavigateUp(): Boolean {
//        val navController = this.findNavController(R.id.mainActivity)
//        return navController.navigateUp()
//    }

    private fun updateCarOne(view: View) {

        binding.apply {
            carparkText.text = "Car Park"

            carOneButton.visibility =  View.VISIBLE
            carOneButton.text = "Park 1 : unavailable"
            carOneButton.setBackgroundColor(Color.RED)
            carTwoButton.visibility = View.VISIBLE
            carThreeButton.visibility = View.VISIBLE

            //Park1
            carNameOneEdit.visibility = View.GONE
            carNumOneEdit.visibility = View.GONE
            carBrandOneEdit.visibility = View.GONE

            updateOneButton.visibility = View.GONE
            deleteOneButton.visibility = View.GONE

            //Park2
            carNameTwoEdit.visibility = View.GONE
            carNumTwoEdit.visibility = View.GONE
            carBrandTwoEdit.visibility = View.GONE

            updateTwoButton.visibility = View.GONE
            deleteTwoButton.visibility = View.GONE

            //Park3
            carNameThreeEdit.visibility = View.GONE
            carNumThreeEdit.visibility = View.GONE
            carBrandThreeEdit.visibility = View.GONE

            updateThreeButton.visibility = View.GONE
            deleteThreeButton.visibility = View.GONE

            val inputMethodManger = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManger.hideSoftInputFromWindow(view.windowToken, 0)
        }
}

    private fun updateCarTwo(view: View) {

        binding.apply {
            carparkText.text = "Car Park"

            carOneButton.visibility =  View.VISIBLE
            carTwoButton.visibility = View.VISIBLE
            carTwoButton.text = "Park 2 : unavailable"
            carTwoButton.setBackgroundColor(Color.RED)
            carThreeButton.visibility = View.VISIBLE

            //Park1
            carNameOneEdit.visibility = View.GONE
            carNumOneEdit.visibility = View.GONE
            carBrandOneEdit.visibility = View.GONE

            updateOneButton.visibility = View.GONE
            deleteOneButton.visibility = View.GONE

            //Park2
            carNameTwoEdit.visibility = View.GONE
            carNumTwoEdit.visibility = View.GONE
            carBrandTwoEdit.visibility = View.GONE

            updateTwoButton.visibility = View.GONE
            deleteTwoButton.visibility = View.GONE

            //Park3
            carNameThreeEdit.visibility = View.GONE
            carNumThreeEdit.visibility = View.GONE
            carBrandThreeEdit.visibility = View.GONE

            updateThreeButton.visibility = View.GONE
            deleteThreeButton.visibility = View.GONE

            val inputMethodManger = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManger.hideSoftInputFromWindow(view.windowToken, 0)
        }

    }

    private fun updateCarThree(view: View) {

        binding.apply {
            carparkText.text = "Car Park"

            carOneButton.visibility =  View.VISIBLE
            carTwoButton.visibility = View.VISIBLE
            carThreeButton.visibility = View.VISIBLE
            carThreeButton.text = "Park 3 : unavailable"
            carThreeButton.setBackgroundColor(Color.RED)

            //Park1
            carNameOneEdit.visibility = View.GONE
            carNumOneEdit.visibility = View.GONE
            carBrandOneEdit.visibility = View.GONE

            updateOneButton.visibility = View.GONE
            deleteOneButton.visibility = View.GONE

            //Park2
            carNameTwoEdit.visibility = View.GONE
            carNumTwoEdit.visibility = View.GONE
            carBrandTwoEdit.visibility = View.GONE

            updateTwoButton.visibility = View.GONE
            deleteTwoButton.visibility = View.GONE

            //Park3
            carNameThreeEdit.visibility = View.GONE
            carNumThreeEdit.visibility = View.GONE
            carBrandThreeEdit.visibility = View.GONE

            updateThreeButton.visibility = View.GONE
            deleteThreeButton.visibility = View.GONE

            val inputMethodManger = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManger.hideSoftInputFromWindow(view.windowToken, 0)
        }
    }

    private fun deleteCarOne() {

        binding.apply {
            carparkText.text = "Car Park"

            carOneButton.visibility =  View.VISIBLE
            carOneButton.text = "Park 1 : available"
            carOneButton.setBackgroundResource(R.color.colorAccent)
            carTwoButton.visibility = View.VISIBLE
            carThreeButton.visibility = View.VISIBLE

            //Park1
            carNameOneEdit.visibility = View.GONE
            carNumOneEdit.visibility = View.GONE
            carBrandOneEdit.visibility = View.GONE
            carNameOneEdit.text.clear()
            carNumOneEdit.text.clear()
            carBrandOneEdit.text.clear()

            updateOneButton.visibility = View.GONE
            deleteOneButton.visibility = View.GONE

            //Park2
            carNameTwoEdit.visibility = View.GONE
            carNumTwoEdit.visibility = View.GONE
            carBrandTwoEdit.visibility = View.GONE

            updateTwoButton.visibility = View.GONE
            deleteTwoButton.visibility = View.GONE

            //Park3
            carNameThreeEdit.visibility = View.GONE
            carNumThreeEdit.visibility = View.GONE
            carBrandThreeEdit.visibility = View.GONE

            updateThreeButton.visibility = View.GONE
            deleteThreeButton.visibility = View.GONE
        }
    }

    private fun deleteCarTwo() {

        binding.apply {
            carparkText.text = "Car Park"

            carOneButton.visibility =  View.VISIBLE
            carTwoButton.visibility = View.VISIBLE
            carTwoButton.text = "Park 2 : available"
            carTwoButton.setBackgroundResource(R.color.colorAccent)
            carThreeButton.visibility = View.VISIBLE

            //Park1
            carNameOneEdit.visibility = View.GONE
            carNumOneEdit.visibility = View.GONE
            carBrandOneEdit.visibility = View.GONE

            updateOneButton.visibility = View.GONE
            deleteOneButton.visibility = View.GONE

            //Park2
            carNameTwoEdit.visibility = View.GONE
            carNumTwoEdit.visibility = View.GONE
            carBrandTwoEdit.visibility = View.GONE

            carNameTwoEdit.text.clear()
            carNumTwoEdit.text.clear()
            carBrandTwoEdit.text.clear()

            updateTwoButton.visibility = View.GONE
            deleteTwoButton.visibility = View.GONE

            //Park3
            carNameThreeEdit.visibility = View.GONE
            carNumThreeEdit.visibility = View.GONE
            carBrandThreeEdit.visibility = View.GONE

            updateThreeButton.visibility = View.GONE
            deleteThreeButton.visibility = View.GONE
        }
    }

    private fun deleteCarThree() {

        binding.apply {
            carparkText.text = "Car Park"

            carOneButton.visibility =  View.VISIBLE
            carTwoButton.visibility = View.VISIBLE
            carThreeButton.visibility = View.VISIBLE
            carThreeButton.text = "Park 3 : available"
            carThreeButton.setBackgroundResource(R.color.colorAccent)

            //Park1
            carNameOneEdit.visibility = View.GONE
            carNumOneEdit.visibility = View.GONE
            carBrandOneEdit.visibility = View.GONE

            updateOneButton.visibility = View.GONE
            deleteOneButton.visibility = View.GONE

            //Park2
            carNameTwoEdit.visibility = View.GONE
            carNumTwoEdit.visibility = View.GONE
            carBrandTwoEdit.visibility = View.GONE

            updateTwoButton.visibility = View.GONE
            deleteTwoButton.visibility = View.GONE

            //Park3
            carNameThreeEdit.visibility = View.GONE
            carNumThreeEdit.visibility = View.GONE
            carBrandThreeEdit.visibility = View.GONE

            carNameThreeEdit.text.clear()
            carNumThreeEdit.text.clear()
            carBrandThreeEdit.text.clear()

            updateThreeButton.visibility = View.GONE
            deleteThreeButton.visibility = View.GONE
        }
    }

    private fun addCarOne() {
        binding.apply {
            carparkText.text = "Park 1"

            carOneButton.visibility =  View.GONE
            carTwoButton.visibility = View.GONE
            carThreeButton.visibility = View.GONE

            //Park1
            carNameOneEdit.visibility = View.VISIBLE
            carNumOneEdit.visibility = View.VISIBLE
            carBrandOneEdit.visibility = View.VISIBLE

            updateOneButton.visibility = View.VISIBLE
            deleteOneButton.visibility = View.VISIBLE

            //Park2
            carNameTwoEdit.visibility = View.GONE
            carNumTwoEdit.visibility = View.GONE
            carBrandTwoEdit.visibility = View.GONE

            updateTwoButton.visibility = View.GONE
            deleteTwoButton.visibility = View.GONE

            //Park3
            carNameThreeEdit.visibility = View.GONE
            carNumThreeEdit.visibility = View.GONE
            carBrandThreeEdit.visibility = View.GONE

            updateThreeButton.visibility = View.GONE
            deleteThreeButton.visibility = View.GONE

            val inm1 = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inm1.showSoftInput(carNameOneEdit, 0)

            val inm2 = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inm2.showSoftInput(carNumOneEdit, 0)

            val inm3 = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inm3.showSoftInput(carBrandOneEdit, 0)
        }
    }
    private fun addCarTwo() {
        binding.apply {
            carparkText.text = "Park 2"

            carOneButton.visibility =  View.GONE
            carTwoButton.visibility = View.GONE
            carThreeButton.visibility = View.GONE

            //Park1
            carNameOneEdit.visibility = View.GONE
            carNumOneEdit.visibility = View.GONE
            carBrandOneEdit.visibility = View.GONE

            updateOneButton.visibility = View.GONE
            deleteOneButton.visibility = View.GONE

            //Park2
            carNameTwoEdit.visibility = View.VISIBLE
            carNumTwoEdit.visibility = View.VISIBLE
            carBrandTwoEdit.visibility = View.VISIBLE

            updateTwoButton.visibility = View.VISIBLE
            deleteTwoButton.visibility = View.VISIBLE

            //Park3
            carNameThreeEdit.visibility = View.GONE
            carNumThreeEdit.visibility = View.GONE
            carBrandThreeEdit.visibility = View.GONE

            updateThreeButton.visibility = View.GONE
            deleteThreeButton.visibility = View.GONE

            val inm1 = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inm1.showSoftInput(carNameTwoEdit, 0)

            val inm2 = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inm2.showSoftInput(carNumTwoEdit, 0)

            val inm3 = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inm3.showSoftInput(carBrandTwoEdit, 0)
        }
    }

    private fun addCarThree() {
        binding.apply {
            carparkText.text = "Park 3"

            carOneButton.visibility =  View.GONE
            carTwoButton.visibility = View.GONE
            carThreeButton.visibility = View.GONE

            //Park1
            carNameOneEdit.visibility = View.GONE
            carNumOneEdit.visibility = View.GONE
            carBrandOneEdit.visibility = View.GONE

            updateOneButton.visibility = View.GONE
            deleteOneButton.visibility = View.GONE

            //Park2
            carNameTwoEdit.visibility = View.GONE
            carNumTwoEdit.visibility = View.GONE
            carBrandTwoEdit.visibility = View.GONE

            updateTwoButton.visibility = View.GONE
            deleteTwoButton.visibility = View.GONE

            //Park3
            carNameThreeEdit.visibility = View.VISIBLE
            carNumThreeEdit.visibility = View.VISIBLE
            carBrandThreeEdit.visibility = View.VISIBLE

            updateThreeButton.visibility = View.VISIBLE
            deleteThreeButton.visibility = View.VISIBLE

            val inm1 = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inm1.showSoftInput(carNameThreeEdit, 0)

            val inm2 = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inm2.showSoftInput(carNumThreeEdit, 0)

            val inm3 = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inm3.showSoftInput(carBrandThreeEdit, 0)
        }
    }

}
