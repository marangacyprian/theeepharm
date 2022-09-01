package com.example.pharmahelp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.backpain.*

class backpainActivity : AppCompatActivity() {
    val language= arrayOf<String>("Cat-Cow Pose","Seated-Twist","Downward-Dog Pose","Plow-pose","Seated ForWard Fold")
    val description=arrayOf<String>(
        "Starting in tabletop position on your hands and knees, alternate between arching your back and rounding it as you push down on the floor with your hands and tops of your feet. "+
                "These postures help to massage the spine, while also stretching the back and the torso. These postures are a great way to keep the back limber—and happy.",
        "You have many options when it comes to twisting postures. One of the basic and effective ones is Marichyasana C. Keep your left leg straight and bend your right leg so your foot is flat. Place your right hand on the floor behind you for support, like a tripod, and twist so you can hook your left elbow over the right thigh.\n" +
                "\n" +
                "If this is too much, you can also grab hold of your right knee and twist to look over your right shoulder. Other options are to bend the left leg under you or bend both legs and let them fall to the side then twist in whichever way your knees are facing.",
        "There's a reason Down Dog is one of the most iconic postures in yoga. It can rejuvenate your entire body. Start in tabletop and raise your hips so your body is in an upside down V position. Relax your head and neck and draw your inner thighs toward the back of the room. Spreading your shoulder blades apart will stretch your upper back even more, and reaching your hips up and back will help to open your lower back.\n" +
                "\n" +
                "Breathe for five to seven breaths.",
        "From Shoulder Stand, bend at your hips to bring your toes or top of your feet to the floor." +
                " Your hands can remain against your back for support, or you can clasp them together, keeping your forearms on the floor. Hold this as long as is comfortable to get a powerful stretch in your shoulders and spine. " +
                "If this is too much, you can place a chair behind and you rest your feet on the chair.",
        "It's easy to do a Seated Forward Fold in a way that won't benefit you, but doing it right can open the lower back and offer relief from stiffness and pain. From a seated position with your legs extended forward, reach for your shins, ankles, or feet, bending at the hips.\n" +
                "\n" +
                "Instead of rounding your back, continue to reach your sternum forward, lengthening the torso. " +
                "If this hurts your back, bend your knees as needed." )
    val image = arrayOf<Int>(
        R.drawable.catcowpose,R.drawable.seatedtwist,R.drawable.downwarddog,R.drawable.plowpose,R.drawable.seatedforwardfold)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.backpain)
        val myListAdapter = PoseListAdapter(this,language,description,image)
        poselist.adapter = myListAdapter
    }
}
