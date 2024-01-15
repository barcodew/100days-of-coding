import 'package:uigojek/models/model_promo.dart';
import 'package:uigojek/pages/TabMenu/Pesanan.dart';
import 'package:uigojek/pages/details_profile.dart';
import 'package:flutter/material.dart';

class Beranda extends StatelessWidget {
  const Beranda({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    final MediaQueryWidth = MediaQuery.of(context).size.width;
    final MediaQueryHeight = MediaQuery.of(context).size.height;
    final bodyHeight = MediaQueryHeight - MediaQuery.of(context).padding.top;

    return Scaffold(
        body: Container(
      // background
      width: MediaQueryWidth,
      height: bodyHeight,
      color: Colors.green,
      child: SingleChildScrollView(
        child: Stack(
          // dasar putih
          children: [
            Row(
              mainAxisAlignment: MainAxisAlignment.spaceEvenly,
              children: [
                Container(
                  margin: const EdgeInsets.only(top: 30),
                  width: MediaQueryWidth * 0.8,
                  height: 40,
                  decoration: BoxDecoration(
                      color: Colors.white,
                      borderRadius: BorderRadius.circular(20)),
                  // kolom search
                  child: Row(
                    mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                    children: [
                      const Icon(Icons.search),
                      SizedBox(
                        width: MediaQueryWidth * 0.65,
                        child: const TextField(
                          decoration: InputDecoration(
                              hintText: "Cari layanan,makanan & tujuan",
                              border: InputBorder.none),
                        ),
                      ),
                    ],
                  ),
                ),
                // profile button
                Container(
                  margin: const EdgeInsets.only(top: 30),
                  width: 40,
                  height: 40,
                  decoration: BoxDecoration(
                      color: Colors.white,
                      borderRadius: BorderRadius.circular(40)),
                  child: Material(
                    color: Colors.transparent,
                    borderRadius: BorderRadius.circular(40),
                    child: InkWell(
                      borderRadius: BorderRadius.circular(40),
                      child: Image.asset("images/users-profile.png"),
                      onTap: () {
                        Navigator.of(context).push(
                          MaterialPageRoute(
                            builder: (_) => const Profile(),
                          ),
                        );
                      },
                    ),
                  ),
                ),
              ],
            ),
            // menu utama
            Container(
              padding: const EdgeInsets.all(20),
              margin: EdgeInsets.only(top: bodyHeight * 0.12),
              width: MediaQueryWidth,
              height: bodyHeight * 1.1,
              decoration: const BoxDecoration(
                color: Colors.white,
                borderRadius: BorderRadius.vertical(
                  top: Radius.circular(20),
                ),
              ),
              // menu warna biru
              child: Column(
                children: [
                  Container(
                    width: MediaQueryWidth * 0.86,
                    height: 100,
                    decoration: BoxDecoration(
                        borderRadius: BorderRadius.circular(20),
                        color: const Color.fromRGBO(0, 129, 160, 1)),
                    child: Row(
                      mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                      children: [
                        Container(
                          padding: const EdgeInsets.all(10),
                          width: 150,
                          height: 80,
                          decoration: BoxDecoration(
                              color: Colors.white,
                              borderRadius: BorderRadius.circular(20)),
                          child: Column(
                            crossAxisAlignment: CrossAxisAlignment.start,
                            children: [
                              Row(
                                children: [
                                  Image.asset(
                                    "images/gopay.png",
                                    width: 18,
                                  ),
                                  const Text(
                                    " Gopay",
                                    style: TextStyle(
                                        fontSize: 15.0,
                                        fontWeight: FontWeight.w500),
                                  ),
                                ],
                              ),
                              const Text(
                                "Rp 1.234.567",
                                style: TextStyle(
                                    fontSize: 15.0,
                                    fontWeight: FontWeight.w500),
                              ),
                              const Text(
                                "Klik & cek Riwayat",
                                style: TextStyle(
                                    fontSize: 12.0, color: Colors.green),
                              ),
                            ],
                          ),
                        ),
                        Column(
                          mainAxisAlignment: MainAxisAlignment.center,
                          children: [
                            Container(
                              width: 40,
                              height: 40,
                              decoration: BoxDecoration(
                                  color: Colors.white,
                                  borderRadius: BorderRadius.circular(10)),
                              child: IconButton(
                                  onPressed: () {},
                                  icon: const Icon(
                                    Icons.add,
                                    color: Color.fromRGBO(0, 129, 160, 1),
                                  )),
                            ),
                            const Text(
                              "Top Up",
                              style: TextStyle(
                                  fontWeight: FontWeight.w500,
                                  color: Colors.white),
                            )
                          ],
                        ),
                        Column(
                          mainAxisAlignment: MainAxisAlignment.center,
                          children: [
                            Container(
                              width: 40,
                              height: 40,
                              decoration: BoxDecoration(
                                  color: Colors.white,
                                  borderRadius: BorderRadius.circular(10)),
                              child: IconButton(
                                  onPressed: () {},
                                  icon: const Icon(
                                    Icons.arrow_upward,
                                    color: Color.fromRGBO(0, 129, 160, 1),
                                  )),
                            ),
                            const Text(
                              "Bayar",
                              style: TextStyle(
                                  fontWeight: FontWeight.w500,
                                  color: Colors.white),
                            )
                          ],
                        ),
                        Column(
                          mainAxisAlignment: MainAxisAlignment.center,
                          children: [
                            Container(
                              width: 40,
                              height: 40,
                              decoration: BoxDecoration(
                                  color: Colors.white,
                                  borderRadius: BorderRadius.circular(10)),
                              child: IconButton(
                                  onPressed: () {},
                                  icon: const Icon(
                                    Icons.rocket_launch,
                                    color: Color.fromRGBO(0, 129, 160, 1),
                                  )),
                            ),
                            const Text(
                              "Eksplor",
                              style: TextStyle(
                                  fontWeight: FontWeight.w500,
                                  color: Colors.white),
                            )
                          ],
                        ),
                      ],
                    ),
                  ),
                  const SizedBox(
                    height: 20.0,
                  ),
                  // menu bulat"
                  SizedBox(
                    width: MediaQueryWidth * 0.9,
                    height: 170,
                    child: Column(
                      children: [
                        Row(
                          mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                          children: [
                            Column(
                              children: [
                                Container(
                                  width: 50,
                                  height: 50,
                                  decoration: BoxDecoration(
                                    color: Colors.green,
                                    borderRadius: BorderRadius.circular(50),
                                  ),
                                  child: Material(
                                    color: Colors.transparent,
                                    child: InkWell(
                                      borderRadius: BorderRadius.circular(20),
                                      child: Image.asset("images/bike.png"),
                                      onTap: () {},
                                    ),
                                  ),
                                ),
                                const Text(
                                  "GoRide",
                                  style: TextStyle(
                                      fontWeight: FontWeight.w500,
                                      fontSize: 13),
                                )
                              ],
                            ),
                            Column(
                              children: [
                                Container(
                                  width: 50,
                                  height: 50,
                                  decoration: BoxDecoration(
                                    color: Colors.green,
                                    borderRadius: BorderRadius.circular(50),
                                  ),
                                  child: Material(
                                    color: Colors.transparent,
                                    child: InkWell(
                                      borderRadius: BorderRadius.circular(20),
                                      child:
                                          Image.asset("images/Vectormobil.png"),
                                      onTap: () {},
                                    ),
                                  ),
                                ),
                                const Text(
                                  "GoCar",
                                  style: TextStyle(
                                      fontWeight: FontWeight.w500,
                                      fontSize: 13),
                                )
                              ],
                            ),
                            Column(
                              children: [
                                Container(
                                  width: 50,
                                  height: 50,
                                  decoration: BoxDecoration(
                                    color: Colors.red,
                                    borderRadius: BorderRadius.circular(50),
                                  ),
                                  child: Material(
                                    color: Colors.transparent,
                                    child: InkWell(
                                      borderRadius: BorderRadius.circular(20),
                                      child: Image.asset("images/sendok.png"),
                                      onTap: () {},
                                    ),
                                  ),
                                ),
                                const Text(
                                  "GoFood",
                                  style: TextStyle(
                                      fontWeight: FontWeight.w500,
                                      fontSize: 13),
                                )
                              ],
                            ),
                            Column(
                              children: [
                                Container(
                                  width: 50,
                                  height: 50,
                                  decoration: BoxDecoration(
                                    color: Colors.red,
                                    borderRadius: BorderRadius.circular(50),
                                  ),
                                  child: Material(
                                    color: Colors.transparent,
                                    child: InkWell(
                                      borderRadius: BorderRadius.circular(20),
                                      child: Image.asset("images/cart.png"),
                                      onTap: () {},
                                    ),
                                  ),
                                ),
                                const Text(
                                  "GoMart",
                                  style: TextStyle(
                                      fontWeight: FontWeight.w500,
                                      fontSize: 13),
                                )
                              ],
                            ),
                          ],
                        ),
                        const SizedBox(
                          height: 20.0,
                        ),
                        Row(
                          mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                          children: [
                            Column(
                              children: [
                                Container(
                                  width: 50,
                                  height: 50,
                                  decoration: BoxDecoration(
                                    color: Colors.green,
                                    borderRadius: BorderRadius.circular(50),
                                  ),
                                  child: Material(
                                    color: Colors.transparent,
                                    child: InkWell(
                                      borderRadius: BorderRadius.circular(20),
                                      child: Image.asset("images/boxsend.png"),
                                      onTap: () {},
                                    ),
                                  ),
                                ),
                                const Text(
                                  "GoSend",
                                  style: TextStyle(
                                      fontWeight: FontWeight.w500,
                                      fontSize: 13),
                                )
                              ],
                            ),
                            Column(
                              children: [
                                Container(
                                  width: 50,
                                  height: 50,
                                  decoration: BoxDecoration(
                                    color: Colors.blue,
                                    borderRadius: BorderRadius.circular(50),
                                  ),
                                  child: Material(
                                    color: Colors.transparent,
                                    child: InkWell(
                                      borderRadius: BorderRadius.circular(20),
                                      child: Image.asset("images/tagihan.png"),
                                      onTap: () {},
                                    ),
                                  ),
                                ),
                                const Text(
                                  "GoTagihan",
                                  style: TextStyle(
                                      fontWeight: FontWeight.w500,
                                      fontSize: 13),
                                )
                              ],
                            ),
                            Column(
                              children: [
                                Container(
                                  width: 50,
                                  height: 50,
                                  decoration: BoxDecoration(
                                    color: Colors.green,
                                    borderRadius: BorderRadius.circular(50),
                                  ),
                                  child: Material(
                                    color: Colors.transparent,
                                    child: InkWell(
                                      borderRadius: BorderRadius.circular(20),
                                      child: Image.asset("images/kereta.png"),
                                      onTap: () {},
                                    ),
                                  ),
                                ),
                                const Text(
                                  "GoTransit",
                                  style: TextStyle(
                                      fontWeight: FontWeight.w500,
                                      fontSize: 13),
                                )
                              ],
                            ),
                            Column(
                              children: [
                                Container(
                                  width: 50,
                                  height: 50,
                                  decoration: BoxDecoration(
                                    color: Colors.grey,
                                    borderRadius: BorderRadius.circular(50),
                                  ),
                                  child: Material(
                                    color: Colors.transparent,
                                    child: InkWell(
                                      borderRadius: BorderRadius.circular(20),
                                      child: const Icon(Icons.menu),
                                      onTap: () {},
                                    ),
                                  ),
                                ),
                                const Text(
                                  "Lainnya",
                                  style: TextStyle(
                                      fontWeight: FontWeight.w500,
                                      fontSize: 13),
                                )
                              ],
                            ),
                          ],
                        ),
                      ],
                    ),
                  ),
                  // Menu Promo
                  SizedBox(
                    width: MediaQueryWidth * 0.9,
                    height: 250,
                    child: Column(
                      crossAxisAlignment: CrossAxisAlignment.start,
                      children: [
                        Row(
                          children: [
                            Container(
                              width: 20,
                              decoration: BoxDecoration(
                                  color: Colors.red,
                                  borderRadius: BorderRadius.circular(20)),
                              child: Image.asset("images/sendok.png"),
                            ),
                            const Text(
                              " GoFood",
                              style: TextStyle(fontWeight: FontWeight.w500),
                            ),
                          ],
                        ),
                        const Text(
                          "Promo Hari Jadi GoFood",
                          style: TextStyle(fontWeight: FontWeight.w500),
                        ),
                        const Text(
                          "Cari promo yang cocok untukmu disini",
                          style: TextStyle(
                              fontWeight: FontWeight.w500, color: Colors.grey),
                        ),
                        const SizedBox(
                          height: 8.0,
                        ),
                        SingleChildScrollView(
                          scrollDirection: Axis.horizontal,
                          child: Container(
                            height: 185,
                            decoration: const BoxDecoration(),
                            child: Row(
                              children: [
                                PromoMenu(
                                    Judul: "Diskon Total Belanja",
                                    teks1: "Promo Hari Jadi",
                                    teks2: "Diskon s.d",
                                    teksBesar: "85rb"),
                                PromoMenu(
                                    Judul: "Jadwal Promo",
                                    teks1: "Promo Hari Jadi",
                                    teks2: "Kalender Promo",
                                    teksBesar: "Promo"),
                                PromoMenu(
                                    Judul: "Diskon Menu",
                                    teks1: "Promo Hari Jadi",
                                    teks2: "Diskon s.d",
                                    teksBesar: "25rb"),
                              ],
                            ),
                          ),
                        )
                      ],
                    ),
                  ),
                  SizedBox(
                    width: MediaQueryWidth * 0.9,
                    height: 250,
                    child: Column(
                      crossAxisAlignment: CrossAxisAlignment.start,
                      children: [
                        Row(
                          children: [
                            Container(
                              width: 20,
                              decoration: BoxDecoration(
                                  color: Colors.red,
                                  borderRadius: BorderRadius.circular(20)),
                              child: Image.asset("images/sendok.png"),
                            ),
                            const Text(
                              " GoFood",
                              style: TextStyle(fontWeight: FontWeight.w500),
                            ),
                          ],
                        ),
                        const Text(
                          "Promo Hari Jadi GoFood",
                          style: TextStyle(fontWeight: FontWeight.w500),
                        ),
                        const Text(
                          "Cari promo yang cocok untukmu disini",
                          style: TextStyle(
                              fontWeight: FontWeight.w500, color: Colors.grey),
                        ),
                        const SizedBox(
                          height: 8.0,
                        ),
                        SingleChildScrollView(
                          scrollDirection: Axis.horizontal,
                          child: Container(
                            height: 185,
                            decoration: const BoxDecoration(),
                            child: Row(
                              children: [
                                PromoMenu(
                                    Judul: "Diskon Total Belanja",
                                    teks1: "Promo Hari Jadi",
                                    teks2: "Diskon s.d",
                                    teksBesar: "85rb"),
                                PromoMenu(
                                    Judul: "Jadwal Promo",
                                    teks1: "Promo Hari Jadi",
                                    teks2: "Kalender Promo",
                                    teksBesar: "Promo"),
                                PromoMenu(
                                    Judul: "Diskon Menu",
                                    teks1: "Promo Hari Jadi",
                                    teks2: "Diskon s.d",
                                    teksBesar: "25rb"),
                              ],
                            ),
                          ),
                        )
                      ],
                    ),
                  )
                ],
              ),
            ),
          ],
        ),
      ),
    ));
  }
}
