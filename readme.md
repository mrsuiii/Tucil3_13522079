# Tugas Kecil 3 Strategi Algoritma

> Membuat word ladder solver dengan UCS,GBFS, dan A*. <!-- If you have the project hosted somewhere, include the link here. -->

## Word ladder
Word ladder (juga dikenal sebagai Doublets, word-links, change-the-word puzzles,
paragrams, laddergrams, atau word golf) adalah salah satu permainan kata yang terkenal
bagi seluruh kalangan. Word ladder ditemukan oleh Lewis Carroll, seorang penulis dan
matematikawan, pada tahun 1877. Pada permainan ini, pemain diberikan dua kata yang
disebut sebagai start word dan end word. Untuk memenangkan permainan, pemain harus
menemukan rantai kata yang dapat menghubungkan antara start word dan end word.
Banyaknya huruf pada start word dan end word selalu sama. Tiap kata yang berdekatan
dalam rantai kata tersebut hanya boleh berbeda satu huruf saja. Pada permainan ini,
diharapkan solusi optimal, yaitu solusi yang meminimalkan banyaknya kata yang dimasukkan
pada rantai kata. Berikut adalah ilustrasi serta aturan permainan.
<!-- * [License](#license) -->


## UCS, GBFS, and A* definition
UCS (Uniform Cost Search): Algoritma ini mencari solusi dengan biaya terendah. Ia mengeksplorasi simpul berdasarkan biaya jalur dari simpul awal ke simpul yang sedang dipertimbangkan.
GBFS (Greedy Best-First Search): Algoritma ini memprioritaskan simpul berdasarkan nilai heuristik. Ia cenderung memilih simpul yang dianggap paling dekat dengan tujuan, tanpa mempertimbangkan biaya jalur yang sebenarnya.
A (A-Star)**: Algoritma ini adalah perpaduan antara UCS dan GBFS. Ia menggunakan fungsi heuristik untuk menghitung perkiraan biaya total dari simpul awal ke tujuan melalui simpul yang sedang dipertimbangkan. A berusaha menemukan jalur dengan biaya terkecil yang mungkin, dengan mempertimbangkan baik biaya aktual maupun estimasi biaya ke depan (heuristik).

<!-- You don't have to answer all the questions - just the ones relevant to your project. -->


## prerequisite
- java


## how to use(Only windows)
    
1. Compile
```bash
    javac -d bin src/*.java src/utils/*.java
```
2. go to bin
```bash
    cd bin
```
3. Run
```bash
    java Main
```


## Contact
Created by [@mrsuiii](https://www.flynerd.pl/)  feel free to contact me!
13522079 - Emery Fathan Zwageri

<!-- Optional -->
<!-- ## License -->
<!-- This project is open source and available under the [... License](). -->

<!-- You don't have to include all sections - just the one's relevant to your project -->