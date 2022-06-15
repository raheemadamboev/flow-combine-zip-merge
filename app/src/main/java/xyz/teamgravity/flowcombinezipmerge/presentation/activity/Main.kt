package xyz.teamgravity.flowcombinezipmerge.presentation.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.viewmodel.compose.viewModel
import xyz.teamgravity.flowcombinezipmerge.R
import xyz.teamgravity.flowcombinezipmerge.presentation.component.CardItem
import xyz.teamgravity.flowcombinezipmerge.presentation.theme.FlowCombineZipMergeTheme
import xyz.teamgravity.flowcombinezipmerge.presentation.viewmodel.MainViewModel

class Main : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FlowCombineZipMergeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val viewmodel = viewModel<MainViewModel>()

                    Row(
                        modifier = Modifier.fillMaxSize()
                    ) {
                        CardItem(
                            name = stringResource(id = R.string.combine),
                            content = viewmodel.combine
                        )
                        CardItem(
                            name = stringResource(id = R.string.zip),
                            content = viewmodel.zip
                        )
                        CardItem(
                            name = stringResource(id = R.string.merge),
                            content = viewmodel.merge
                        )
                    }
                }
            }
        }
    }
}
