# interface

## Mi is az az interfész?
Tágabb értelmezés: két elemet összecsatoló egység.

Egy olyan programozási szerkezet, amely **meghatározza egy osztály számára a megvalósítandó metódusokat**.

Tehát meghatároz egy adag metódust, amit az őt 
megvalósító osztálynak implementálnia kell.
Egyfajta tervként (blueprint) szolgál az osztályok számára,
hogy milyen metódusokat kötelesek megvalósítani.

Az interface-ek:
- csak formát adnak meg, implementáció nélkül
- fontos szerepet játszanak az absztrakció, modularitás, polimorfizmus
elérésében/kialakításában

## Mire jó? 
Például:
- Egy metódus olyan objektum példányt vár paraméterül,
amelynek az osztálya implementál egy adott interface-t. Ilyenkor
a függvénynek bármely olyan objektumot átadhatunk, amelynek
az osztálya implementálja az adott interface-t.
- Heterogén kollekciók léterhozására: egy `Shape` tömbbe tudunk rakni
`Tringale` és `Square` objektumokat is.

## Konvenciók
Az interfészek nevei gyakran az adott funkció vagy szerep alapján választódnak ki, ezek gyakran
melléknevek, pl. `Movable`, `Resizable`, de előfordulnak főnevek is pl. `Logger`, `Validator`.
Konvenció szerint nagybetűvel kezdjük őket.

## 1. Interface létrehozása
Az interfész a `interface` kulcsszóval és az interfész nevével deklarálható, pl:
`public interface MyInterface { }`.

### 1.a `Shape` interface létrehozása
Készíts egy `Shape` interface-t!
IntelliJ-ben a projekstruktúrán jobb klikk &rarr; `New` &rarr; `Java class` &rarr; `Interface`.

Mi történik akkor, ha példányosítani szeretnéd pl. `Shape shape = new Shape();`
formátumban és miért?

### 1.b `Shape` interface metódusainak deklarálása
Mi az ami közös működés lehet minden alakzatban? A kerület és a terület kiszámítása!
Deklarálj ezeknek egy-egy metódust `getPerimeter()` és `getArea` néven, `double` visszatérési értékkel!
<details><summary>Megoldás</summary><pre>
public interface Shape {
    double getPerimeter();
    double getArea();
}
</pre></details>

## 2. Interface implementálása

### 2.a Circle osztály
Készíts egy `Circle` osztályt, ami implementálja a `Shape` interfészt!
Ezt az `implements` kulcsszóval tudod elérni: `public class Circle implements Shape{}`.
Miért dob még hibát a fordító?

`Alt` + `Enter` billenytűkombinációval válaszd az `Implement methods`
opciót és implementáld az interfész metódusait (egyelőre elég, ha 0-val térnek vissza)!

<details><summary>Megoldás</summary><pre>
public class Circle implements Shape {

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
</pre></details>

Mi kéne ahhoz, hogy ténylegesen működésre bírjuk ezeket a metódusokat? Vezess be egy `radius` változót
és egy konstruktort, majd implementáld a metódusokat!

<details><summary>Megoldás</summary><pre>
public class Circle implements Shape {

   private double radius;

   public Circle(double radius) {
       this.radius = radius;
   }

   @Override
   public double getPerimeter() {
       return 2 * radius * Math.PI ;
   }

   @Override
   public double getArea() {
       return radius * radius * Math.PI;
   }
}
</pre></details>

Példányosíts két `Circle` változót és próbáld ki a metódusaid!
