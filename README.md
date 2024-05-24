# Mini Function Test

## Overview

Mini Function Test is a Java-based command-line application that allows users to perform various operations including evaluating expressions, checking the validity of results, and sorting numbers. The project includes predefined test cases as well as custom test cases that users can interact with through a user-friendly interface.

## Features

- **Literal Tests**: Evaluate and validate literal expressions.
- **Variable Tests**: Handle and test variable expressions.
- **Arithmetic Expressions**: Perform and test basic arithmetic operations.
- **Logical Expressions**: Evaluate logical operations.
- **Conditional Expressions**: Handle conditional (if-else) expressions.
- **Sort Numbers**: Sort a list of numbers in ascending order.

## Installation

1. **Clone the Repository**:
    ```bash
    git clone https://github.com/hosafxd/ProjectMiniCompiler
    cd ProjectMiniCompiler
    ```

2. **Compile the Project**:
    ```bash
    javac -d bin src/minifunctest/*.java
    ```

3. **Run the Application**:
    ```bash
    java -cp bin minifunctest.MiniFuncTest
    ```

## Usage

Upon running the application, the user is presented with the following options:

- **Enter 'if' to proceed with the if statement**: This allows the user to input and evaluate an if-else conditional expression.
- **Enter 'check' to proceed with the result checker**: This allows the user to input an arithmetic expression and check its validity.
- **Enter 'sort' to proceed with sort**: This allows the user to input a list of numbers to be sorted in ascending order.

### Example Commands

1. **If Statement**:
    - **Condition**: `17 < 23`
    - **Expression if True**: `correct`
    - **Expression if False**: `incorrect`

2. **Check Expression**:
    - **Expression**: `2 * 5 = 10`
    - **Result**: `true`

3. **Sort Numbers**:
    - **Input**: `sort 11.6 4 7.8 2`
    - **Output**: `2 4 7.8 11.6`

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request for any enhancements or bug fixes.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Contact

For questions or support;
https://github.com/hosafxd/
furkanozturk5406@hotmail.com  

