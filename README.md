# Nicomachus Number Classification

## Perfect Numbers (easy)

Determine if a number is perfect, abundant, or deficient based on Nicomachus' (60 - 120 CE) classification scheme for positive integers.

### Nicomachus' Classification Scheme

The Greek mathematician Nicomachus devised a classification scheme for positive integers, categorizing them as perfect, abundant, or deficient based on their aliquot sum. The aliquot sum is defined as the sum of the factors of a number, excluding the number itself. For example, the aliquot sum of 15 is 1 + 3 + 5 = 9.

- **Perfect:** aliquot sum = number

  - 6 is a perfect number because (1 + 2 + 3) = 6
  - 28 is a perfect number because (1 + 2 + 4 + 7 + 14) = 28

- **Abundant:** aliquot sum > number

  - 12 is an abundant number because (1 + 2 + 3 + 4 + 6) = 16
  - 24 is an abundant number because (1 + 2 + 3 + 4 + 6 + 8 + 12) = 36

- **Deficient:** aliquot sum < number
  - 8 is a deficient number because (1 + 2 + 4) = 7
  - Prime numbers are deficient

### Program Usage

Create a program that accepts a positive integer input and outputs the correct number classification. All other inputs are ignored, and the program exits.

### Example Usage

```bash
> java NicomachusProgram 6
Perfect

> java NicomachusProgram 12
Abundant

> java NicomachusProgram 8
Deficient

> java NicomachusProgram ABC
// no output
```
