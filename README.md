# 🔐 Password Generator

![output-onlinepngtools copy](https://github.com/user-attachments/assets/50d4f84f-2e97-4b2e-8586-e17e572f843d)





A simple, colorful, and user-friendly **Java-based GUI application** for generating secure passwords of varying strengths — Easy, Medium, and Hard.

## ✨ Features

- 🟢 **Easy Passwords** — Great for everyday use  
- 🟡 **Medium Passwords** — Adds complexity with random letters & numbers  
- 🔴 **Hard Passwords** — Fully randomized and allows user-specified input  
- 🖥️ Clean Swing UI with themed pop-up windows  
- 🎨 Color-coded design for clarity and usability

---

## 📸 Screenshots

### 🏠 Main Window
![Screenshot 2025-04-08 at 1 46 12 AM](https://github.com/user-attachments/assets/e87754c9-b487-4f7c-a8b9-7464d38eb27e)

### 🔓Easy Password Creator
![Screenshot 2025-04-08 at 1 46 57 AM](https://github.com/user-attachments/assets/ecbf7bec-b297-4421-b9e0-54f05217571d)
![Screenshot 2025-04-08 at 1 46 12 AM](https://github.com/user-attachments/assets/ebfe9b9c-5c8e-44dd-90c5-00504d468d89)



### 🔐 Hard Password Creator
![Screenshot 2025-04-08 at 1 47 21 AM](https://github.com/user-attachments/assets/5c53867c-d184-4c93-b772-f1a58fffff15)
![Screenshot 2025-04-08 at 1 47 32 AM](https://github.com/user-attachments/assets/388024fe-2d92-4dd9-903b-03ae93f42939)


<!-- Add more screenshots as needed -->

---

## 🚀 How It Works

Each difficulty level uses a unique logic engine to generate passwords:

- **Easy**: Combines user input (optional), 4 random letters, and 3 digits  
- **Medium**: Option to insert user input with 5-digit number & symbols  
- **Hard**: Fully randomized string of 15 characters or mix with user-supplied keyword

> Built using **Java Swing**, this project showcases a modular architecture with separate generators for each difficulty.

---

## 📦 Project Structure

```bash
├── PasswordGenerator.java         # Main GUI & logic
├── EasyGenerator.java            # Easy password logic
├── MediumGenerator.java          # Medium password logic
├── HardGenerator.java            # Hard password logic
