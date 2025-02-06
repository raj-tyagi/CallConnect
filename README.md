# CallConnect

CallConnect is an Android application designed to provide seamless video and audio calling functionalities using the Zego Cloud SDK. This app allows users to easily initiate and receive calls by entering user IDs, making it perfect for connecting with friends, family, and colleagues.

## Features
 
- **Video Calling**: Initiate high-quality video calls with other users.
- **Audio Calling**: Make clear and reliable audio calls.
- **User-Friendly Interface**: Simple and intuitive design for easy navigation.
- **Call Invitations**: Send and receive call invitations effortlessly.
- **Notification Management**: Customizable notifications for incoming calls.

## Screenshots

<p align="center">
  <img src="https://github.com/raj-tyagi/CallConnect/assets/110656539/aab04b9f-e2a1-4093-aec7-6525623c0f13" width="200" />
  <img src="https://github.com/raj-tyagi/CallConnect/assets/110656539/aba4ceb7-7e9e-4487-b979-9a61459cf421" width="200" />
  <img src="https://github.com/raj-tyagi/CallConnect/assets/110656539/33087a79-0dd2-4ec8-9308-6b8962a57850" width="200" />
  <img src="https://github.com/raj-tyagi/CallConnect/assets/110656539/cd02e6aa-0189-4b0b-bf1a-f1f33d967714" width="200" />
</p>
<p align="center">
  <img src="https://github.com/raj-tyagi/CallConnect/assets/110656539/bb58934e-32ba-44f6-9b47-9864dc3bc4da" width="200" />
  <img src="https://github.com/raj-tyagi/CallConnect/assets/110656539/0d6086f3-de8a-4e59-aae4-421b662f0002" width="200" />
  <img src="https://github.com/raj-tyagi/CallConnect/assets/110656539/1f6c8a40-926c-4a3a-ad58-d8a67592637c" width="200" />
</p>

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

If you have any questions or suggestions, feel free to reach out 
- **Raj Tyagi**: [LinkedIn](https://www.linkedin.com/in/raj-tyagi-83765b21b/) 

