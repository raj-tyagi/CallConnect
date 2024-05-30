# CallConnect

CallConnect is an Android application designed to provide seamless video and audio calling functionalities using the Zego Cloud SDK. This app allows users to easily initiate and receive calls by entering user IDs, making it perfect for connecting with friends, family, and colleagues.

## Features

- **Video Calling**: Initiate high-quality video calls with other users.
- **Audio Calling**: Make clear and reliable audio calls.
- **User-Friendly Interface**: Simple and intuitive design for easy navigation.
- **Call Invitations**: Send and receive call invitations effortlessly.
- **Notification Management**: Customizable notifications for incoming calls.

## Screenshots

*(Add screenshots here if available)*

## Installation

1. Clone the repository:
   ```sh
   git clone https://github.com/yourusername/CallConnect.git
   ```
2. Open the project in Android Studio.
3. Sync the project with Gradle files.
4. Build and run the app on an Android device or emulator.

## Usage

1. Open the CallConnect app.
2. Enter your user ID in the provided text field.
3. Press the "Next" button to navigate to the VideoCallActivity screen.
4. Enter the receiver's user ID to start a call.
5. Choose between a video or audio call by pressing the corresponding button.

## Configuration

Ensure you have the correct `appID` and `appSign` from Zego Cloud:

```kotlin
private fun videoCallServices(userID: String) {
    val appID: Long = 1522513164 // your App ID of Zego Cloud
    val appSign = "your_app_sign_here" // your App Sign of Zego Cloud
    val application = application // Android's application context
    // ...rest of the configuration
}
```

## Dependencies

- Zego Cloud SDK: Prebuilt Call Service
- AndroidX Libraries
- Material Components

## Contributing

We welcome contributions! Please follow these steps to contribute:

1. Fork the repository.
2. Create your feature branch (`git checkout -b feature/YourFeature`).
3. Commit your changes (`git commit -m 'Add some feature'`).
4. Push to the branch (`git push origin feature/YourFeature`).
5. Open a Pull Request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact

If you have any questions or suggestions, feel free to reach out to [Raj Tyagi] (https://www.linkedin.com/in/raj-tyagi-83765b21b/)

