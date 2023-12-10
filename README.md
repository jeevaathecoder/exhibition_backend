Exhibition Project
Introduction
Welcome to the Online Exhibition Project! This project aims to create a virtual exhibition platform where users can explore different stalls, view stall details, images, videos, download brochures, and connect with stall admins for inquiries. Admins can log in to create and manage stalls, collecting and displaying stall details in the database.

Table of Contents
Features
Installation
Usage
Technologies Used
Contributing
License
Features
User Features:
Stall Exploration:

View a list of stalls.
Navigate through stalls with a next button.
Stall Details:

Access detailed information about each stall.
View stall pictures and videos.
Download Brochures:

Download stall brochures for offline viewing.
Connect with Admins:

Initiate a chat with the respective admin for stall-related queries.
Admin Features:
Stall Management:
Log in as an admin to access the admin panel.
Create stalls by providing stall details through a form.
Store and display stall information in the database.

Contributing
If you would like to contribute to this project, please follow the Contributing Guidelines.

Test Datas:

To add a Stall

url: localhost:8080/stalls/add

{
  "stallName": "Stall 1",
  "stallDescription": "Description for Stall 1",
  "photoUrl": "https://stall1-photo-url.com",
  "videoUrl": "https://stall1-video-url.com",
  "broucherUrl": "https://stall1-broucher-url.com",
  "user": {
    "id": 1,
    "role": "ROLE_ADMIN"
  }
}{
  "stallName": "Stall 2",
  "stallDescription": "Description for Stall 2",
  "photoUrl": "https://stall2-photo-url.com",
  "videoUrl": "https://stall2-video-url.com",
  "broucherUrl": "https://stall2-broucher-url.com",
  "user": {
    "id": 1,
    "role": "ROLE_ADMIN"
  }
}{
  "stallName": "Stall 3",
  "stallDescription": "Description for Stall 3",
  "photoUrl": "https://stall3-photo-url.com",
  "videoUrl": "https://stall3-video-url.com",
  "broucherUrl": "https://stall3-broucher-url.com",
  "user": {
    "id": 1,
    "role": "ROLE_ADMIN"
  }
}{
  "stallName": "Stall 4",
  "stallDescription": "Description for Stall 4",
  "photoUrl": "https://stall4-photo-url.com",
  "videoUrl": "https://stall4-video-url.com",
  "broucherUrl": "https://stall4-broucher-url.com",
  "user": {
    "id": 1,
    "role": "ROLE_ADMIN"
  }
}{
  "stallName": "Stall 5",
  "stallDescription": "Description for Stall 5",
  "photoUrl": "https://stall5-photo-url.com",
  "videoUrl": "https://stall5-video-url.com",
  "broucherUrl": "https://stall5-broucher-url.com",
  "user": {
    "id": 1,
    "role": "ROLE_ADMIN"
  }
} 