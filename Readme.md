# Hinta analysointi ohjelma

## Ohje hinta analysointi ohjelman käyttöön

1. Aja ohjelma Eclipsestä tai käyttäen jar tiedostoa

```
java -jar HintaAnalysointiOhjelma.jar
```

2. Anna ohjelmalle polku tiedostoon
- Kohtaan ```<Polku tiedostoon>``` laitetaan tiedoston polku
    - Tiedostosta tulee löytyä seuraavat sarakkeet samassa järjestyksessä:
        - Päiväys
        - Sulkemishinta
        - Avaushinta
        - Suurin hinta
        - Matalin hinta
    - Tiedoston ensimmäisellä rivillä on oltava sarakkeiden otsikot
    - Tiedot on oltava puolipisteellä eroteltu
    - Voit käyttää esimerkkitiedostoa apuna (tiedoston nimi: AAPL_Historical_Data.csv, löytyy repository:sta)
```
Tidedosto polku: <Polku tiedostoon>
```

3. Saat tulosteena keskiarvo ja keskihajonta laskelmat hinta tiedoista
- x.xx on tulos numero
```
Kesikarvo sulkemis hinta: x.xx
Kesikarvo avaus hinta: x.xx
Average high price: x.xx
Kesikarvo korkein hinta: x.xx
Keskihajonta sulkemis hinta: x.xx
Keskihajonta avaus hinta: x.xx
Keskihajonta korkein hinta: x.xx
Keskihajonta matalin hinta: x.xx
```