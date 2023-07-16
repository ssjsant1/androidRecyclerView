package com.example.apppractice

class PostProvider {
    companion object{
        val  posts = listOf<PostModel>(
            PostModel(
              photo = "https://upload.wikimedia.org/wikipedia/en/thumb/e/e5/Gedo6sn.jpg/220px-Gedo6sn.jpg",
                person = "Tales from Earthsea",
                autor = "Tomohiko Ishii"
            ),
            PostModel(
              photo = "https://upload.wikimedia.org/wikipedia/en/thumb/0/02/My_Neighbor_Totoro_-_Tonari_no_Totoro_%28Movie_Poster%29.jpg/220px-My_Neighbor_Totoro_-_Tonari_no_Totoro_%28Movie_Poster%29.jpg",
                person = "My Neighbor Totoro",
                autor = "Tōru Hara"
                ),
            PostModel(
              photo = "https://upload.wikimedia.org/wikipedia/en/f/fc/Porco_Rosso_%28Movie_Poster%29.jpg",
                person = "Porco Rosso",
                autor = "Toshio Suzuki"
            ),
            PostModel(
              photo = "https://upload.wikimedia.org/wikipedia/en/0/07/Kiki%27s_Delivery_Service_%28Movie%29.jpg",
                person = "Kiki's Delivery Service",
                autor = "Hayao Miyazaki"
            ),
        )
    }
}