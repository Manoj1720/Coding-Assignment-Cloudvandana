var images = [
    "https://images.unsplash.com/photo-1506748686214-e9df14d4d9d0?w=500&h=300&fit=crop",
    // "images (4).jpeg",  
    "https://images.unsplash.com/photo-1497366754035-f200968a6e72?w=500&h=300&fit=crop",
    // "images (6).jpeg",  
    "https://images.unsplash.com/photo-1511765224389-37f11d8a16c1?w=500&h=300&fit=crop"
    // "images (7).jpeg" 
];

// If the above URLs do not work properly, use the local images mentioned in the comments.

let currentIndex = 0;
var sliderimg = document.getElementById("slider_image");
var prevbtn = document.getElementById("prevbtn");
var nextbtn = document.getElementById("nextbtn");

updateImage();

function updateImage() {
    sliderimg.src = images[currentIndex];
}

nextbtn.addEventListener("click", function () {
    currentIndex = (currentIndex + 1) % images.length;
    updateImage();
});

prevbtn.addEventListener("click", function () {
    currentIndex = (currentIndex - 1 + images.length) % images.length;
    updateImage();
});
