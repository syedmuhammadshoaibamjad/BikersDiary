package com.example.bikersdiary

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val recyclerview: RecyclerView = findViewById(R.id.recyclerview)

        val adapter = ArticlesAdapter(getArticles())
        recyclerview.adapter=adapter
        val manager= LinearLayoutManager(this)
        recyclerview.layoutManager= manager
    }

    fun getArticles(): List<Article> {
        val articles = ArrayList<Article>()

        articles.add(
            Article(
                "2000 Suzuki GSX1300R Hayabusa",
                "September 24, 2024",
                R.drawable.one,
                details = "Ok, we’ll admit the Hayabusa actually came out in 1999, but it was exactly the same in 2000 and its impact on modern motorcycle culture cannot be overstated. At a time when the industry put a premium on extreme speed, the Hayabusa was the fastest production motorcycle in the world upon its release, taking the honor from arch rival Honda and its Super Blackbird. In fact, “Hayabusa” is the Japanese word for peregrine falcon, a bird that preys on Blackbirds—a not-so-subtle jab at Honda. The Hayabusa has been so successful, it has only seen two model updates since its introduction—the latest of which came in 2020—and indeed remains Suzuki’s definitive nod to life in fast lane.\n" +
                        "\n"            )
        )
        articles.add(
            Article(
                "2014 KTM 1290 Super Duke R\n",
                "Date 2, 2024",
                R.drawable.two,
                "Suzuki took a few lessons learned from its iconic GSX-R750 and fitted them into the new big-bore superbike category that was now in full prominence, creating a 145 hp powerhouse that promptly displaced Yamaha, then class king, and its YZF-R1.\n" +
                        "\n" +
                        "The GSX-R1000 was instantly competitive, and when it came to AMA Superbike competition, the model won every championship from 2003 until 2010, when Yamaha fought back. The 2001 GSX-R1000 marked the first true Suzuki superbike of the modern era."
            )
        )
        articles.add(
            Article(
                "2013 BMW R 1200 GS\n",
                "Date 3, 2024",
                R.drawable.tree,
                "In 1998, Ducati design boss Pierre Terblanche unveiled an improbably wild concept bike that paid tribute to Mike Hailwood’s legendary comeback win at the 1978 Isle of Man TT. The designer presented an online poll to fans asking if the bike should be built. While the Ducatisti unsurprisingly voted in favor of production, worldwide enthusiasts let out a collective gasp when production-spec images were released: the road-going version was nearly identical to the breathtaking one-off concept, and 2,000 examples would be produced.\n" +
                        "\n" +
                        "The MH900e, and example of which crossed the Bonhams auction block last April for nearly \$32,000 (shown above), was the first motorcycle to be sold exclusively online, and the first 1,000 of the 2,000 examples produced sold out in 31 minutes. While its Desmodromically valved 904 cc engine produced only 74 hp, and its 2.2-gallon fuel tank was laughably small, the MH900e is coveted as a rare example of a street-legal motorcycle that’s as exuberantly styled as the concept bike that inspired it.\n" +
                        "\n" +
                        "2001 Honda GL "
            )
        )
        articles.add(
            Article(
                "2005 Suzuki GSX-R1000\n",
                "Date 4, 2024",
                R.drawable.four,
                "Honda went back to the drawing board in 2000 for the following year’s GL 1800. The bike featured an increase in capacity from 1,520 cc to 1,832 cc, plus an emphasis on the sportier side of long-distance touring with improved suspension, brakes and ergonomics.\n" +
                        "\n" +
                        "The result was a motorcycle so good that it would be 17 years before Honda could come up with another fully revised version worthy of the Gold Wing name. The model is still the standard by which all touring motorcycles are measured."
            )
        )
        articles.add(
            Article(
                "2006 KTM 950 Adventure\n",
                "Date 5, 2024",
                R.drawable.five,
                "The ultimate iteration of what many consider KTM’s greatest adventure bike, the 2006 KTM 950 was the last such machine to come from Mattighofen with carburetors. As such, it became a favorite with global travelers who could fix the bike in the middle of nowhere rather than deal with a finicky fuel-injection system.\n" +
                        "\n" +
                        "Excellent WP suspension coupled with dual gas tanks meant that massive miles could be covered between stops. The 950 helped solidify KTM’s reputation as the motorcycle brand for serious adventure riders, rather than those who primarily commute to the café."
            )
        )
        articles.add(
            Article(
                "2006 Ducati Desmosedici GP16 RR\n",
                "Date 6, 2024",
                R.drawable.six,
                "Ducati’s Desmosedici D16 RR (RR stands for Racing Replica) was as close as you could buy to a MotoGP bike for the street. Using a 990 cc motor modeled on the 2004 Ducati Desmosedici MotoGP racer of Troy Bayliss and Loris Capirossi, Ducati claimed the machine made a rollicking 200 hp and 85 ft lbs of torque from the V-4 engine.\n" +
                        "\n" +
                        "The bike is graced with the very best Öhlins suspension of the period, and was the first production motorcycle to use forged magnesium wheels. It’s an absolute gem that costs a treasure trove to run and service, but is currently skyrocketing in value as it will surely be coveted long into the future."
            )
        )
        articles.add(
            Article(
                "2006 Yamaha YZF-R6\n",
                "Date 7, 2024",
                R.drawable.seven,
                "The 2006 Yamaha YZF-R6 is to sportbike riders what a Remington Model Seven is to serious hunters. This machine debuted a number of technical firsts for Yamaha—the first ride-by-wire throttle in Yamaha’s Chip Controlled Throttle (YCCT), variable inlet tracts, titanium inlet and exhaust valves and an ear-splitting 18,000 rpm redline.\n" +
                        "\n" +
                        "All of these elements helped make the ’06 R6 one of the finest sportbikes of all time. It formed the basis of the R6 line for the rest of the model’s life, which finally ended in 2020 when the last YZF-R6s rolled off the production line."
            )
        )
        articles.add(
            Article(
                "2008 Kawasaki Concours 14\n",
                "Date 8, 2024",
                R.drawable.eight,
                "Taking the design ethos of the Suzuki Hayabusa–killing ZX-14, Kawasaki launched the Concours 14 in 2008. The model is an elegant and fast long-distance touring machine. Thanks to its ZX-14-derived four-cylinder motor, the bike made 150 hp. It also featured variable valve timing, digital tire pressure monitors, an electric windscreen, ABS and a cockpit that enabled pilots to ride for hour after hour in comfort.\n" +
                        "\n" +
                        "In one fell swoop, Kawasaki nearly perfected the high-speed touring motorcycle. The model has remained essentially the same ever since, save for minor tweaks like traction control, some bodywork nips and tucks and subtle suspension changes."
            )
        )
        articles.add(
            Article(
                "2009 Aprilia RSV4 Factory\n",
                "Date 9, 2024",
                R.drawable.nine,
                "With the redoubtable RSV4, Aprilia came back to superbike competition with a vengeance in 2009. Possessing the only V-4 motor you could buy in the class (at least at the time), the RSV4 benefitted from Aprilia engineers who used every bit of knowledge gained from their years of 250 cc Grand Prix domination to create a landmark, track-focused machine.\n" +
                        "\n" +
                        "The bike delivers a stout 180 hp and 85 ft lbs of torque, and is equipped with the best production Öhlins suspension and Brembo brakes of the time. The first RSV4 was dominant almost immediately, taking the 2010 WorldSBK title with Max Biaggi in the saddle. Since then, the RSV4 has garnered two more titles and won countless shootout tests across the globe. The model is now part of the 1100 cc club with the debut of the stupendous 2021 edition."
            )
        )
        articles.add(
            Article(
                "2010 Honda VFR1200F DCT\n",
                "Date 10, 2024",
                R.drawable.ten,
                "Trust it to Honda to push the technical boundaries. The world’s largest motorcycle company did just that with the 2010 VFR1200F, the first such machine to come with Honda’s innovative dual-clutch transmission (DCT). The DCT was the first semi-automatic gearbox fitted to a production motorcycle.\n" +
                        "\n" +
                        "You could still change gears manually via the paddle shifters on the left handlebar, but there was no clutch lever—something many riders needed time to get used to. Powered by a 1,237 cc V-4 motor, the VFR is remembered as a good bike, not a great one, yet was the vehicle Honda used to bring the DCT system to market. That alone is reason enough to include it here."
            )
        )
        articles.add(
            Article(
                "2010 Honda VFR1200F DCT\n",
                "Date 11, 2024",
                R.drawable.eleven,
                "Trust it to Honda to push the technical boundaries. The world’s largest motorcycle company did just that with the 2010 VFR1200F, the first such machine to come with Honda’s innovative dual-clutch transmission (DCT). The DCT was the first semi-automatic gearbox fitted to a production motorcycle.\n" +
                        "\n" +
                        "You could still change gears manually via the paddle shifters on the left handlebar, but there was no clutch lever—something many riders needed time to get used to. Powered by a 1,237 cc V-4 motor, the VFR is remembered as a good bike, not a great one, yet was the vehicle Honda used to bring the DCT system to market. That alone is reason enough to include it here."
            )
        )
        articles.add(
            Article(
                "2010 Honda VFR1200F DCT\n",
                "Date 12, 2024",
                R.drawable.twelve,
                "This is a dummy article content for article 12. It has some placeholder text for testing purposes."
            )
        )
        articles.add(
            Article(
                "2010 BMW S 1000 RR\n",
                "Date 13, 2024",
                R.drawable.thirteen,
                "Few superbikes have blown away the competition like the BMW S 1000 RR. At a time when the world was still reeling from the global financial crisis, BMW kept its development foot flat to the floor and released what is now remembered as the first true digital sportbike. A total of 190 hp was on tap from the 999 cc four-cylinder motor that ran a number of production firsts, including “finger follower” valve actuation for the cams rather than the old “shim-and-bucket” design.\n" +
                        "\n" +
                        "A twin-spar aluminum frame designed primarily for track use was employed, but the big news was the massive electronics suite that included ride-by-wire throttle, lean-angle-sensitive traction control and four variable ride modes. With the S 1000 RR, BMW changed the design game for all superbikes to follow."
            )
        )
        articles.add(
            Article(
                "2013 BMW R 1200 GS\n",
                "Date 14, 2024",
                R.drawable.fourteen,
                "The bike that started the ADV segment way back in 1980 got its biggest update yet in 2013. Dubbed the “wasser-boxer” (water boxer), the 1,170 cc flat-twin engine was partially water-cooled, with power going from 110 hp to 125 hp, and torque measurably increased across the rev range.\n" +
                        "\n" +
                        "With a focus on sporty handling, this GS could even be taken to the racetrack if so desired, and then eat up any dirt roads on the way home. Of course, true to BMW form, it seemed to carry every conceivable rider aid offered, so the tech more than matched the motor. The BMW R 1200 GS became king of the maxi-ADV class, a position it holds to this day."
            )
        )
        articles.add(
            Article(
                "2014 KTM 1290 Super Duke R\n",
                "Date 15, 2024",
                R.drawable.fifteen,
                "The rise of the “super-naked” bike really began with the Aprilia Tuono V4 at the end of the previous decade, but the class was cemented when KTM brought out “the Beast” in 2014. That monster was the 1290 Super Duke R powered by a 1,301 cc V-twin—a naked motorcycle designed for the hooligan in all of us.\n" +
                        "\n" +
                        "The manufacturer quoted an incredible 180 hp for the motor, wrapping it in KTM’s trademark orange steel-trellis chassis, WP suspension (admittedly not as top-of-the-line as it could have been) and just enough electronics and rider aids to lend a faint air of sensibility to the madness. More than that, however, the Super Duke heralded KTM—already an off-road powerhouse—as a truly major player in the street-bike market."
            )
        )
        articles.add(
            Article(
                "2015 Yamaha YZF-R1\n",
                "Date 16, 2024",
                R.drawable.sixteen,
                "For 2015, Yamaha went through the YZF-R1 model from top-to-bottom, releasing a superbike that could be considered the natural successor to the 2010 BMW S 1000 RR in terms of the loaded tech. A new, slender chassis and reworked crossplane-crank motor were crafted, and a slew of electronics were added, the latter including Slide Control.\n" +
                        "\n" +
                        "The 2015 YZF-R1’s power plant was a massive step up from the original crossplane-crank engine in the iterations from 2008 through 2014. This version was such an improvement that Yamaha has only had to make incremental changes in recent years to keep it at the head of the superbike pack.\n" +
                        "\n"
            )
        )
        return articles
    }

}