public class SuperConstructor {
    /** 14. Super Constructor
    # tidak hanya untuk mengakses method atau field yang ada di parent class. kata kunci super juga bisa
      digunakan untuk mengakses constructor
    # namun syaratnya untuk mengakses constructor parent class (constructor yang ada di class parent), kita
     harus mengaksesnya didalam constructor child class.
    # jika sebuah class parent tidak memiliki constructor default yang tidak ada parameternya (maksudnya constructor
      memiliki parameter /tidak memiliki default constructor), maka class child wajib mengakses constructor
      class parent tersebut.
    # kita boleh tidak memanggil default constructor yang ada di class parent karena sebenarnya class child secara
      otomatis memanggil constructor tersebut tapi apa bila di class parent tidak ada default constructor maka kita
      wajib memanggil constructor yang ada di class parent */

    //implementasi keyword super untuk constructor ada di class manager, vicepressident dan manager app
}
