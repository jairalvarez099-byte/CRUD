package com.myapplication.crud_dummyjson

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import com.myapplication.crud_dummyjson.ui.screen.ProductListScreen
import com.myapplication.crud_dummyjson.ui.theme.CRUDDummyJSONTheme
import com.myapplication.crud_dummyjson.ui.viewModel.ProductViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    // Hilt crea el ViewModel con el UseCase ya inyectado
    private val productViewModel: ProductViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CRUDDummyJSONTheme {
                ProductListScreen(viewModel = productViewModel)
            }
        }
    }
}
