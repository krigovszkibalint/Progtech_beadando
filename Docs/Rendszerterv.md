# Rendszertev

## A rendszer célja

A rendszer célja, hogy egyszerre sok, különböző típusú autót tudjunk legyártani az autók gyártása közötti idő meghatározásával.

## Projektterv

Ketten dolgozunk a rendszeren:
- Krigovszki Bálint
- Szabó Gergely Gyula

## Üzleti folyamatok modellje

A felhasználó bejelentkezés után ki tudja választani a legyártani kívánt autó típusát, valamint be tudja vinni az adatokat, melyek alapján a rendszerünk különböző autókat készít. Továbbá visszajelzést kap a felhasználó, hogy milyen autókat készített már el korábban a rendszer.

## Követelmények

- be és kijelentkezés megvalósítása
- erőforrás beállításának lehetősége
- készítés indítása
- elkészült autók megjelenítése (listában)

## Funkcionális terv

![login](login.jpg)

![login](main.jpg)

## Fizikai környezet

Az alakalmazást Java-ban fejlesztjük, adatbázishoz MySQL lesz használva.

## Adatbázis terv

2 táblát veszünk igénybe:
- users: a belépés adatait tároljuk itt
- cars: az elkészített autók listája

## Implementációs terv

Négy tervezési mintát fogunk használni az alkalmazás fejlesztéséhez:
- Factory Method
- Singleton
- Decorator
- Template

