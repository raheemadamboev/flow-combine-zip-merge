package xyz.teamgravity.flowcombinezipmerge.presentation.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun RowScope.CardItem(
    name: String,
    content: String,
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxHeight()
            .weight(1F)
    ) {
        Text(
            text = name,
            style = MaterialTheme.typography.titleLarge
        )
        Text(text = content)
    }
}