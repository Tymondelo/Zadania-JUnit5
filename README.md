## Opis projektu
Projekt "Account" obejmuje implementację klasy `Account`, która reprezentuje konto. Klasa ta umożliwia aktywację konta, sprawdzenie aktywności konta oraz nadanie i sprawdzenie numeru konta.

## Struktura projektu
Projekt składa się z dwóch plików:
1. **Plik 1: Account.java**
   - Zawiera implementację klasy `Account`.
   - Definiuje metody do aktywacji konta, sprawdzenia aktywności konta, nadania numeru konta oraz sprawdzenia numeru konta.

2. **Plik 2: AccountTest.java**
   - Zawiera testy jednostkowe (JUnit) dla klasy `Account`.
   - Sprawdzają różne aspekty funkcjonalności klasy `Account`, takie jak aktywacja konta i sprawdzenie numeru konta.

## Klasa `Account`
Klasa `Account` zawiera następujące pola i metody:

### Pola:
- `private boolean active`: Pole przechowujące informację o aktywności konta.
- `private int number`: Pole przechowujące numer konta.

### Konstruktor:
- `public Account()`: Konstruktor, który ustawia wartości początkowe pól `active` na `false` i `number` na `0`.

### Metody:
- `public void activate()`: Metoda służąca do aktywacji konta, ustawia pole `active` na `true`.
- `public boolean isActive()`: Metoda zwracająca informację o aktywności konta.
- `public void giveNumber()`: Metoda nadająca numer konta (ustawia `number` na 1).
- `public int hasNumber()`: Metoda sprawdzająca numer konta i zwracająca jego wartość.

## Testy jednostkowe (AccountTest)
Plik `AccountTest` zawiera następujące testy jednostkowe, które sprawdzają funkcjonalność klasy `Account`:

1. `void newAccountShouldNotBeActiveAfterCreation()`: Sprawdza, czy nowo utworzone konto nie jest aktywne po utworzeniu.
2. `void accountShouldBeActiveAfterActivation()`: Sprawdza, czy konto jest aktywne po jego aktywacji.
3. `void newAccountShouldNotHaveNameAfterCreation()`: Sprawdza, czy nowo utworzone konto nie ma nadanego numeru konta.
4. `void accountShouldHaveNameAfterInsertingIt()`: Sprawdza, czy konto ma nadany numer konta po nadaniu go.

## Wnioski
Projekt "Account" skupia się na reprezentowaniu konta i umożliwia aktywację oraz nadawanie i sprawdzanie numeru konta. Testy jednostkowe zapewniają sprawdzenie poprawności działania funkcjonalności klasy `Account`.

Autor Tymoteusz Buczyński
