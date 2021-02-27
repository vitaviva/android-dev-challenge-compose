/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.data

import com.example.androiddevchallenge.R

object DemoDataProvider {

    val Edison = Puppy(
        id = 1,
        name = "Edison",
        sex = Sex.Male,
        age = "Adult",
        breed = "Boxer/Labrador Retriever Mix",
        color = "Tan/Yellow/Fawn - with White",
        location = "Beverly Hills, CA",
        story = "Edison was found as a stray injured when he was attached by another dog. Edison" +
            " does not get along well with other dogs, would do great as a single dog in a home." +
            " Very cautious when first meeting, but a love bug and very obedient. " +
            "He knows sit and stays with you with no reaction towards other dogs except being cautious with males because of his experience." +
            " He's been coming out of his shell very nicely, wagging his tail and walking great on a leash. " +
            "His foster says that he is just the best & will make a wonderful forever friend to some lucky adopter. Who knows, that could be you!",
        images = listOf(
            R.drawable.edison_1,
            R.drawable.edison_2,
            R.drawable.edison_3,
            R.drawable.edison_4
        )
    )

    val Precious = Puppy(
        id = 2,
        name = "Precious",
        sex = Sex.Female,
        age = "Young",
        breed = "American Bulldog",
        color = "White - with Brown or Chocolate",
        location = "West Hollywood, CA",
        story = "Precious is a loving pup who just wants to be near her people. " +
            "She likes sitting next to you on the couch watching tv or reading a book, " +
            "she like finding a free corner to sit and watch you cook in the kitchen, " +
            "and she likes sitting in the back seat to run errands. " +
            "She's energetic and friendly and is searching for her perfect permanent family!",
        images = listOf(
            R.drawable.precious_1,
            R.drawable.precious_2,
            R.drawable.precious_3,
            R.drawable.precious_4
        )
    )

    val Tink = Puppy(
        id = 3,
        name = "Tink",
        sex = Sex.Female,
        age = "Young",
        breed = "Shepherd (Unknown Type)/Labrador Retriever Mix",
        color = "Tan/Yellow/Fawn - with White",
        location = "Beverly Hills, CA",
        story = "Hello, my name is Tink! I was rescued from the shelter in honor of a dog who suffered a horrible fate there. " +
            "I love people, but don't get along with most dogs. I am about 3 years old and looking for my forever family. " +
            "If you think that is you please contact Ace of Hearts so we can meet!",
        images = listOf(
            R.drawable.tink_1,
            R.drawable.tink_2,
            R.drawable.tink_3,
            R.drawable.tink_4
        )
    )

    val Riley = Puppy(
        id = 4,
        name = "Riley",
        sex = Sex.Female,
        age = "Young",
        breed = "American Bulldog/Pit Bull Terrier Mix",
        color = "White - with Black",
        location = "West Hollywood, CA",
        story = "Riley was found as a stray by her foster, she is aprox. " +
            "1 year old, very playful, and will be the perfect fit for an active family who is available to continue her puppy training.",
        images = listOf(
            R.drawable.riley_1,
            R.drawable.riley_2,
            R.drawable.riley_3,
        )
    )

    val Hula = Puppy(
        id = 5,
        name = "Hula",
        sex = Sex.Female,
        age = "4 years old, Young",
        breed = "German Shepherd Dog/Australian Cattle Dog Mix",
        color = "Tan/Yellow/Fawn - with Black",
        location = "West Hollywood, CA",
        story = "Hula is a super smart amazing dog with so much love to give. " +
            "Hula is well trained knows all commands sit, heal, go to your bed, stay on your bed, go to your crate, paw she knows it all. " +
            "Hula is very protective and so loving g she needs a experienced owner who keeps her in check and loves her. " +
            "She loves to play with toys she is a great fetcher and will be the most loyal dog you will ever know. " +
            "We require that you meet with our trainer and that you take 15 training sessions with our trainer. " +
            "You will love our trainer he has been training for 30 years. Give Hula a chance to be your forever best friend. " +
            "She was abandoned and given up and hit in the face and she has come through it all.",
        images = listOf(
            R.drawable.hula_1,
            R.drawable.hula_2,
        )
    )

    val Buster = Puppy(
        id = 6,
        name = "Buster",
        sex = Sex.Male,
        age = "Young",
        breed = "Australian Shepherd/Boxer Mix",
        color = "Red/Golden/Orange/Chestnut - with White",
        location = "Beverly Hills, CA",
        story = "Buster loves affection, hikes and treats! He's playful and loves hiking in the canyons.His favorite dinner dish is sloppy joes. " +
            "After dinner he's always excited to cuddle on the couch and watch The Voice. " +
            "He is crate trained,he walks well on a leash now and wears a front clip harness to walk with. He is dog selective, " +
            "if introduced correctly he can be good with another dog of his own size. He gets groomed every six weeks for anal gland expression and shedding. " +
            "He is Incredibly loving, very smart and figured out how to get into our fridge. " +
            "He loves to cuddle. He is very good with my son and checks on him. He has a HUGE prey drive so no cats. " +
            "Give us a call to meet this handsome fellow!",
        images = listOf(
            R.drawable.buster_1,
            R.drawable.buster_2,
            R.drawable.buster_3,
            R.drawable.buster_4,
        )
    )

    val Lucas = Puppy(
        id = 7,
        name = "Lucas",
        sex = Sex.Male,
        age = "5 years old, Young",
        breed = "English Bulldog",
        color = "White - with Tan, Yellow or Fawn",
        location = "Beverly Hills, CA",
        story = "Lucas was left in a balcony tied up and all because they had a baby and decided he would not be ok with their baby. " +
            "He never dis anything wrong. After the trauma they caused Lucas would not allow a collar on his neck who could blame him. " +
            "Good news we brought Luca to the best trainer in LA and Luca walks on a Kesha and wares the right gear. " +
            "Lucas would love all the love he missed out in as a baby. Lucas would love to be your only dog, he has so much live to give. " +
            "He loves to be loved he gets so happy when he is being petted and he loves his belly rubs. He is local to LA and sorry we don’t ship dogs out of state. " +
            "He is truly incredible and deserves a loving experienced bully breed owner.",
        images = listOf(
            R.drawable.lucas_1,
            R.drawable.lucas_2,
            R.drawable.lucas_3,
            R.drawable.lucas_4,
        )
    )

    val Harry = Puppy(
        id = 8,
        name = "Harry",
        sex = Sex.Male,
        age = "6 years old, Young",
        breed = "Poodle (Miniature)/Schnauzer (Miniature) Mix",
        color = "White - with Tan, Yellow or Fawn",
        location = "Beverly Hills, CA",
        story = "This little nugget had a rough start in life.. he came to us with dreadlocks!\n" +
            "Needs a special, savvy and understanding person to love him and respect his needs. He doesn't like to be picked up!!!!! " +
            "He wags his tail all the time and plays with toys for hours. He’s pretty funny and entertaining. " +
            "He has improved tremendously from his training and is so much friendlier but still acts out. Loves long walks. Knows basic commands. " +
            "Still must be careful handling him.\n" +
            "He is sensitive and can be unpredictable. Needs very experienced adopter and a garden is ideal so he can potty when he wants. " +
            "No children! Best in a home with a dog door and years of enclosed patio.",
        images = listOf(
            R.drawable.harry_1,
            R.drawable.harry_2,
            R.drawable.harry_3,
        )
    )

    val Bronx = Puppy(
        id = 9,
        name = "Bronx",
        sex = Sex.Male,
        age = "13 years old, Senior",
        breed = "Pit Bull Terrier",
        color = "Gray/Blue/Silver/Salt & Pepper",
        location = "Beverly Hills, CA",
        story = "Everyone meet Bronx he is a sweet old man who came to us from a high kill shelter with a very low chance of being adopted due to his age. " +
            "He is amazing with all dogs big and small males and females. Loves to go on walks, car rides, and just as mellow as they get. " +
            "Bronx will need a home that can provide him with a loving home and spoil him rotten. " +
            "We are not sure about his past as he was brought in as a \"stray\" our guess is that due to him being older his family no longer wanted him.",
        images = listOf(
            R.drawable.bronx_1,
        )
    )

    val Gunner = Puppy(
        id = 10,
        name = "Gunner",
        sex = Sex.Male,
        age = "1 year old, Young",
        breed = "Boxer/Bull Terrier Mix",
        color = "Tan/Yellow/Fawn - with White",
        location = "Beverly Hills, CA",
        story = "Love that Dog Hollywood is the Animal Rescue Initiative of The Daddio Collective; " +
            "a 501c3 Charity Dedicated to Changing the Lives of Children.Animals.Communities. " +
            "Love that Dog Hollywood encourages people to adopt, discover the option of fostering, " +
            "education in pet guardianship and share the Love and joy a companion dog brings. " +
            "We work to help, save and re-home the over looked and red listed dogs that will soon be euthanized at local shelters.",
        images = listOf(
            R.drawable.gunner_1,
            R.drawable.gunner_2,
            R.drawable.gunner_3,
        )
    )

    val Roxy = Puppy(
        id = 11,
        name = "Roxy",
        sex = Sex.Female,
        age = "4 years old, Young",
        breed = "Boxer/Bull Terrier Mix",
        color = "White - with Tan, Yellow or Fawn",
        location = "Beverly Hills, CA",
        story = "Roxy was found tied to a post by a good samaritan. " +
            "She had been tied for several days prior to being picked up with no food or water. " +
            "It was clear that she was bred for her puppies and dumped. Unfortunately these dogs are being bred because of the demand for puppies.\n" +
            "She is very sweet and well behaved. She's very smart and picks up on things quickly. She is well behaved indoors. " +
            "She just wants a family that will love her forever.\n" +
            "She was shy at first to other dogs but is doing great around them now. " +
            "She was very emaciated and we have gotten some weight back on her. " +
            "Her fur shows the neglect she endured but now with regular feedings not only is she super happy she is starting to look healthy.",
        images = listOf(
            R.drawable.roxy_1,
        )
    )

    val banner = listOf(
        Edison, Precious, Tink, Riley,
    )
    val puppyList = listOf(
        Buster, Lucas, Gunner, Harry, Bronx, Hula, Roxy
    )
}
