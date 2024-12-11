# Bank-Operations-Project

This project is designed to handle various banking operations using a **Strategy Pattern**. 
The application utilizes **FileNIO** for efficient file handling, ensuring secure and fast operations.

## Project Objectives

The main goal of this project is to implement modular and scalable banking functionalities such as:

- Changing customer passwords.
- Increasing the balance based on the phone number.
- Transferring money between accounts.
- Displaying a customer's associated cards.

## Features

1. **ChangePasswordStrategy**:  
   Allows users to securely update their passwords. Password changes are validated and logged for consistency.

2. **IncreaseBalancePhoneNumberStrategy**:  
   Enables admins to increase the balance of a customer based on their phone number.

3. **MoneyTransferStrategy**:  
   Facilitates transferring money between different accounts with transaction logging.

4. **ShowCardsCustomerStrategy**:  
   Displays all cards associated with a specific customer, ensuring quick access to card information.

5. **FileNIO Integration**:  
   All data is read from and written to files using **Java NIO** for high-performance I/O operations.

## Technologies Used

- **Java 17**: Programming language for building the application.
- **FileNIO**: For file handling operations such as reading, writing, and updating data.
- **Strategy Pattern**: To create flexible and reusable components for different banking operations.
 
## Project Structure

The project is structured to align with the **Strategy Pattern** and separates concerns efficiently:

