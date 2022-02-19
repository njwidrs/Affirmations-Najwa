package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation


class Datasource {

    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation("Krabi", R.drawable.image1),
            Affirmation("Hat Yai", R.drawable.image2),
            Affirmation("Bangkok", R.drawable.image3),
            Affirmation("Songkhla", R.drawable.image4),
            Affirmation("Phuket", R.drawable.image5),
            Affirmation("Chiang Mai", R.drawable.image6),
            Affirmation("Pattaya", R.drawable.image7),
            Affirmation("Phi Phi", R.drawable.image8),
            Affirmation("Koh Samui", R.drawable.image9),
            Affirmation("Chiang Rai", R.drawable.image10)
        )
    }
}