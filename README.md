A real-time chat application built with Spring Boot, designed to emulate the live chat experience. app enables users to send and receive messages instantly with WebSocket communication, offering a seamless and interactive chat interface.

🚀 Features
🧩 Real-time messaging with WebSockets and STOMP protocol

👤 User join/leave notifications

💬 Public chatroom with instant message broadcasting

🖥️ Responsive UI with HTML, CSS, and JavaScript

🔒 Basic user validation and message handling on server

🛠️ Built using Spring Boot, SockJS, and STOMP.js

⚙️ Tech Stack
Backend: Spring Boot, Spring WebSocket, STOMP

Frontend: HTML, CSS, JavaScript, SockJS, STOMP.js

Protocol: WebSocket over STOMP

📁 Folder Structure
arduino
Copy
Edit
├── src
│   └── main
│       ├── java
│       │   └── com.emark.chat
│       │       ├── controller
│       │       ├── model
│       │       ├── config
│       │       └── service
│       └── resources
│           ├── static
│           │   └── js
│           └── templates
│               └── index.html
└── pom.xml
🧪 How to Run
Clone the repository

Open in your preferred IDE

Run mvn clean install

Launch using your IDE or run mvn spring-boot:run

Visit http://localhost:8080/ in your browser
