package com.example.pharmahelp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.backpain.*

class thyroidActivity: AppCompatActivity(){
    val language= arrayOf<String>("Supported Shoulder Stand","Fish Pose","Bridge Pose","Cobra pose")
    val description=arrayOf<String>(
        "The supported shoulder stand pose involves being upside down, which is known in yoga as an inversion.\n" +
                "\n" +
                "Inversions help increased blood flow to the throat. Yoga researchers believe this helps to stimulate the thyroid.\n" +
                "\n" +
                "The Sanskrit name for this pose is Sarvangasana.\n" +
                "\n" +
                "To do a supported shoulder stand, a person should:\n" +
                "    1.Lie down flat on the back\n" +
                "    2.Place a folded towel or blanket under the shoulders to support them\n" +
                "    3.Bring the shoulders to the edge of the towel while resting the head on the mat\n" +
                "    4.Place the arms on either side with palms facing down\n" +
                "    5.Press arms and back firmly into the floor\n" +
                "    6.Breathe in and lift legs up at a right angle\n" +
                "    7.Breathe out and lift legs up, pushing up onto the shoulders\n" +
                "    8.Push hands into the lower back to support the hips\n" +
                "    9.Keep the stomach pulled in, so the core is strong\n" +
                "    10.Hold the body and legs in a straight line up from the shoulders\n" +
                "    11.Keep the chin tucked into the chest\n" +
                "    12.Breathe deeply three times\n" +
                "    13.Lower the legs back down slowly, keeping the core engaged\n",
        "The Fish Pose is an excellent pose to do after a shoulder stand or Plow, as it stretches the body in the opposite direction. In yoga, people refer to this as a counter pose.\n" +
                "\n" +
                "The Sanskrit name for this pose is Matsyasana.\n" +
                "\n" +
                "The Fish Pose is straightforward to perform and is perfect for beginners.\n" +
                "\n" +
                "To do the Fish Pose, a person should:\n" +
                "\n" +
                "    1.Sit down with the legs extended in front of them\n" +
                "    2.Place the hands on the mat behind them with their fingers tucked under their buttocks\n" +
                "    3.Lower the elbows to the mat and lean backward\n" +
                "    4.Align the shoulders with the elbows\n" +
                "    5.Gently drop the head back as far as it feels comfortable, with the eventual aim of touching the crown of the head on the mat\n" +
                "    6.Keep the chest up and open, imagining a string pulling it up to the sky\n" +
                "    7.Breathe deeply three times\n" +
                "    8.Slowly lift the head up and release the arms to come out of the position\n",
        "The Bridge Pose is good for strengthening the back. It may also help promote thyroid health.\n" +
                "\n" +
                "The Sanskrit name for this pose is Setu Bandha Sarvangasana.\n" +
                "\n" +
                "To do the Bridge Pose, a person should:\n" +
                "\n" +
                "    Lie on the mat with their back on the floor\n" +
                "    2.Draw the feet inwards towards their hips\n" +
                "    3.Keep the feet and knees in line with the hips\n" +
                "    4.With arms by the sides of the body, press the palms into the floor\n" +
                "    5.Lift the hips up to the sky, imagining a string pulling the hips upward\n" +
                "    6.If this is difficult, put the palms on the lower back for support\n" +
                "    7.Tuck the chin into the chest\n" +
                "    8.Breathe deeply three times\n" +
                "    9.Slowly lower the hips to come out of the position\n",
        "The Cobra Pose gently stimulates the throat and thyroid.\n" +
                "\n" +
                "The Sanskrit name for this pose is Bhujangasana.\n" +
                "\n" +
                "To do this pose, a person should:\n" +
                "\n" +
                "    1.Lie down on their stomach on the mat\n" +
                "    2.Place the palms on the mat under the shoulders\n" +
                "    3.Squeeze the elbows into their sides\n" +
                "    4.Press the palms into the mat\n" +
                "    5.Lift the head up until the chest lifts of the mat and the back is arched\n" +
                "    6.Drop the head back towards the bottom if this feels comfortable\n" +
                "    7.Breathe deeply three times\n" +
                "    8.Slowly lower chest and head back down to the mat\n")

    val image = arrayOf<Int>(R.drawable.supportshoulder,R.drawable.fish,R.drawable.bridgepose,R.drawable.cobrayoga)

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.backpain)
        val myListAdapter = BackpainAdapter(this,language,description,image)
        poselist.adapter = myListAdapter
    }
}