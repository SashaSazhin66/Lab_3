package com.work.lab3

import android.graphics.Bitmap
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Data(val name: String, val description: String, val image: Int): Parcelable {

    companion object {
        fun getData() =
            listOf(
                Data("Victor",
                    "male Russian personal name of Latin " +
                            "origin, comes from lat. Victor (\"winner\"). In ancient " +
                            "Roman mythology, Victor is the epithet of the gods of Jupiter " +
                            "and Mars [3]. In the era of the emergence of Christianity, the " +
                            "name became popular among the early followers of the new religion;" +
                            " it was associated with Christ's victory over death and sin.",
                    R.drawable.ic_2),
                Data("Ihor", "Igor is a male Russian personal name of Scandinavian origin.\n" +
                        "\n" +
                        "According to one version, the name Igor (like the name Ingvar (Ingvar)," +
                        " which distinguishes the annals from the first, see Ingvar) came from the " +
                        "Scandinavian name Ingvarr. The first part of the name - Ing - refers to one" +
                        " of the names of the Scandinavian god of fertility Freyr, and the second " +
                        "- Varr - means \"to protect\" [5] Thus, literally, the name Ingvar means \"Keep " +
                        "Freyr.\" There are female Scandinavian names with the same root: Inga, Ingrid and" +
                        " Ingeborg, which can occur on behalf of the Scandinavian goddess Freya.",
                    R.drawable.ic_3),
                Data("Nadya", "Nadezhda (the old Russian form of the name - Nadezhda) " +
                        "is a female Russian personal name of Old Slavic origin; is tracing paper from Greek." +
                        " Ελπίς (Elpis), named after an early Christian saint.\n" +
                        "\n" +
                        "The name was included in the Russian name-book along with the names Faith and Love; the" +
                        " history of the existence of all three names in the Russian language is largely similar.",
                    R.drawable.ic_4),
                Data("Ilya", "Ilya (obsolete. Elijah) - personal name, Russian version of the biblical " +
                        "name of the other Heb. אֵלִיָּהוּ ’Ēliiah,’ Ēliiāhū (Eliyahu) - Yahweh is my God - Elijah the prophet, " +
                        "which is described in the Old Testament, revered in Judaism, Christianity and Islam (Arabic. إلياس or إيليا - Ilyas).\n" +
                        "\n" +
                        "In the name of Eliyahu: אלי - my God; יהו is a short form of the Unpronounceable Name of God. Thus, the name Ilya " +
                        "refers to the theophore names (from Θεός, theos - God), which includes the word \"God\" or its names. Patronymic " +
                        "(patronymics): Ilyich, Ilyinichna. The obsolete is the son of Ilyin, Ilyin (patronymic names of notorious people " +
                        "in Russia were originally formed as a short form of possessive adjective on the corresponding name, for example: " +
                        "“Ivan the son of Ilyin” or, in a later version, “Ivan Ilyin.” The end to “-wich” goes back to patronymic of the " +
                        "ancient Russian princes and nobility of Moscow Russia).",
                    R.drawable.ic_5))
    }
}