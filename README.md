# Втора лабораториска вежба по Софтверско инженерство

## Teodor Jovanovski 223277

### Control Flow Graph

![cfgsi](https://github.com/TeodorJ13/SI_2024_lab2_223277/assets/159393109/833ae13f-f3a2-4c60-a280-20987c585edc)

### Цикломатска комплексност
Предикатниот број на јазли е 10 бидејќи има 7 if услови и 2 for циклуси, според формулата p+1.
Според графот вкупниот број на јазли е 26, бројот на краеви е 34 и според формулата M=E-N+2 -> 34-26+2=10.

### Тест случаи според критериумот Every branch

1. allitems = null, payment = 0 -> Ќе излезе RuntimeException бидејќи количката е null.
2. allitems = [], payment=0 (Празна количка, сумата за плаќање е 0. -> Ќе се врати true бидејќи сумата е помала или еднаква на плаќањето.
3. allitems = [new Item (null, "5901234123457", 75, 0)], payment = 80 -> Производот нема име, така што името е поставено како unknown. Ќе врати true. 
4. allItems = [new Item("", "8712345678901", 400, 0)], payment = 400 -> Производот нема име, така што името е поставено како unknown. Ќе врати true.
5. allItems = [new Item("VivaPraska", null, 85, 0)], payment = 100 -> Нема да се изврши правилно бидејќи нема баркод за идентификување на производот.
6. allItems = [new Item("StobiFlips", "А512Г3456789012", 10, 0)], payment = 10 -> Ќе се повика исклучок бидејќи во баркодот не смее да има знак кој не е бројка.
7. allItems = [new Item("Plazma", "9780123456789", 125, 0.16f)], payment = 150 -> Програмата ќе се изврши, ќе врати true и ќе има 16% попуст на вкупната цена за плаќање.
8. allItems = [new Item("AlpikoCaramel", "1234567890123", 145, 0), new Item("AlpikoForestFruit", "6901234567890", 145, 0.15f)], payment = 200 -> Програмата ќе врати false бидејќи износот на двата производи е поголем од износот на плаќање.


### Тест случаи според критериумот Multiple condition

if (item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcode().charAt(0) == '0').

1. Item("Bajadera", "0345678901234", 568, 0.29f) -> Тестот успешно ќе се изврши, бидејќи цената на производот е поголема од 300 и попустот е поголем од 0 и првиот карактер од баркодот е 0. -> TTT
2. Item("Temjanika", "0456789012345", 629, 0) -> Нема да се извшри бидејќи нема попуст. -> TTF
3. Item("Martini", "4567890123456", 938, 0) -> Првиот карактер на баркодот не е 0. -> TFT
4. Item("Persil", "9876543210987", 902, 0) -> Првиот карактер на баркодот не е 0 и нема попуст. -> TFF
5. Item("Raffaello", "0012345678902", 213, 0.1f) -> Цената е помала од 300. -> FTT
6. Item("Milka", "5678901234567", 128, 0.2f) -> Цената е помала од 300 и првиот карактер на баркодот не е 0. -> FTF
7. Item("Skittles", "0890123456789", 49, 0) -> Нема попуст и цената е помала од 300. -> FFT
8. Item("Ketchup", "2345678901234", 155, 0) -> Ништо не е валидно. -> FFF
