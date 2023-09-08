package com.hfad.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDisplay = findViewById<Button>(R.id.btnDisplay)
        btnDisplay.setOnClickListener() {
//          создаем переменную employeesListItem и ею ссылаемся на наш спиннер который содержит массив. в переменную employeesItem через свойство selectedItem получаем выбранный конкретный элемент массива
            val employeesListItem = findViewById<Spinner>(R.id.employeesList)
            val employeesItem = employeesListItem.selectedItem

//          дальше по логике создаем функцию getEmployeesListItem, суть которой - вернуть аргументом строку, где если мы видим совпадение, то выдать прописанный мною в функции текст

//          в переменную employeesList через мною написанную функцию getEmployeesListItem получаем сам массив из файла xml, но с добавленным мною текстом через функцию. В переменную employees методом reduce получаю каждое отдельное совпадение, чтобы дальше его вывести
            val employeesList = getEmployeesListItem(employeesItem.toString())
            val employees = employeesList.reduce {str, item -> str + '\n' + '\n' + item}

//          в переменную displayTextEmployees получаю ссылку на TextView. Затем через свойство .text меняю сам текст (который изначально пустой в xml), на полученный результат из reduce
            val displayTextEmployees = findViewById<TextView>(R.id.textEmployees)
            displayTextEmployees.text = employees
        }
    }

    fun getEmployeesListItem(employee: String):List<String> {
        return when (employee) {
            "Упаковка" -> listOf("Клава (Басурманин)", "Люба (Басурманин)", "Паша (классный чел, хз зачем выбрал эту тупую работу)", "Оксана (по совместительству бригадир)")
            "Рондо" -> listOf("Раисия Максимовна (старый злобный хитрый вертухай жопализ да и малину ворует заебала блядь всех уже сука)", "Маликова (норм, но ебануая немного)", "Люся (она же люба, она же люда, она же крашеная. любимое животное начальницы)", "Галя (классная, все время гы-гы-кает)", "Горшок (в целом норм но очень душный и тяжелый, муж начальницы)","Денис (1 из немногих нормальных челов на заводе)", "Миша (бывший зек, пиздец, я ему смену сдаю еще. охуенно блять...)", "Синолицкий (я, мечтаю свалить с этой помойки побыстрее и навсегда, если не сопьюсь или не подсяду на мефедрон","Раисия Максимовна (старый злобный хитрый вертухай жопализ да и малину ворует заебала блядь всех уже сука)", "Маликова (норм, но ебануая немного)", "Люся (она же люба, она же люда, она же крашеная. любимое животное начальницы)", "Галя (классная, все время гы-гы-кает)", "Горшок (в целом норм но очень душный и тяжелый, муж начальницы)","Денис (1 из немногих нормальных челов на заводе)", "Миша (бывший зек, пиздец, я ему смену сдаю еще. охуенно блять...)", "Синолицкий (я, мечтаю свалить с этой помойки побыстрее и навсегда, если не сопьюсь или не подсяду на мефедрон", "Раисия Максимовна (старый злобный хитрый вертухай жопализ да и малину ворует заебала блядь всех уже сука)", "Маликова (норм, но ебануая немного)", "Люся (она же люба, она же люда, она же крашеная. любимое животное начальницы)", "Галя (классная, все время гы-гы-кает)", "Горшок (в целом норм но очень душный и тяжелый, муж начальницы)","Денис (1 из немногих нормальных челов на заводе)", "Миша (бывший зек, пиздец, я ему смену сдаю еще. охуенно блять...)", "Синолицкий (я, мечтаю свалить с этой помойки побыстрее и навсегда, если не сопьюсь или не подсяду на мефедрон", "Раисия Максимовна (старый злобный хитрый вертухай жопализ да и малину ворует заебала блядь всех уже сука)", "Маликова (норм, но ебануая немного)", "Люся (она же люба, она же люда, она же крашеная. любимое животное начальницы)", "Галя (классная, все время гы-гы-кает)", "Горшок (в целом норм но очень душный и тяжелый, муж начальницы)","Денис (1 из немногих нормальных челов на заводе)", "Миша (бывший зек, пиздец, я ему смену сдаю еще. охуенно блять...)", "Синолицкий (я, мечтаю свалить с этой помойки побыстрее и навсегда, если не сопьюсь или не подсяду на мефедрон", "Раисия Максимовна (старый злобный хитрый вертухай жопализ да и малину ворует заебала блядь всех уже сука)", "Маликова (норм, но ебануая немного)", "Люся (она же люба, она же люда, она же крашеная. любимое животное начальницы)", "Галя (классная, все время гы-гы-кает)", "Горшок (в целом норм но очень душный и тяжелый, муж начальницы)","Денис (1 из немногих нормальных челов на заводе)", "Миша (бывший зек, пиздец, я ему смену сдаю еще. охуенно блять...)", "Синолицкий (я, мечтаю свалить с этой помойки побыстрее и навсегда, если не сопьюсь или не подсяду на мефедрон", "Раисия Максимовна (старый злобный хитрый вертухай жопализ да и малину ворует заебала блядь всех уже сука)", "Маликова (норм, но ебануая немного)", "Люся (она же люба, она же люда, она же крашеная. любимое животное начальницы)", "Галя (классная, все время гы-гы-кает)", "Горшок (в целом норм но очень душный и тяжелый, муж начальницы)","Денис (1 из немногих нормальных челов на заводе)", "Миша (бывший зек, пиздец, я ему смену сдаю еще. охуенно блять...)", "Синолицкий (я, мечтаю свалить с этой помойки побыстрее и навсегда, если не сопьюсь или не подсяду на мефедрон" ,"Раисия Максимовна (старый злобный хитрый вертухай жопализ да и малину ворует заебала блядь всех уже сука)", "Маликова (норм, но ебануая немного)", "Люся (она же люба, она же люда, она же крашеная. любимое животное начальницы)", "Галя (классная, все время гы-гы-кает)", "Горшок (в целом норм но очень душный и тяжелый, муж начальницы)","Денис (1 из немногих нормальных челов на заводе)", "Миша (бывший зек, пиздец, я ему смену сдаю еще. охуенно блять...)", "Синолицкий (я, мечтаю свалить с этой помойки побыстрее и навсегда, если не сопьюсь или не подсяду на мефедрон")
            "Резка хлеба" -> listOf("Шахноза (чурка-аутист, да еще и баба)", "Чурка-вежливый (норм чувак, но ни слова по русски не понимает и не может сказать)")
            "Клининг" -> listOf("Старая бабка (всё время заебывает молодую уборщицу, тк живет в мире собственных комплексов и несбывшихся мечтаний. яб на ее месте сбросился с крыши...)", "молодая уборщица (нахуя она сюда устроилась? ебанутая... могла секретаршей пойти работать в любой офис за более высокую зп и более лучшее отношение)", "чурка уборщица (очень похожа на одну испанскую порно-актрису. сначала я реально подумал на секунду, что это она...)")
            "Тестоводы" -> listOf("Гуля (объективно - самый квалифицированный тестовод из всех, иногда тупит, но это ничего)", "Люба (считает себя самой умной, но делает уебанское тяжелейшее тесто - это не правильно. Любимица высших эшелонов власти-производства", "Кирилл (полупокер по моему")
            "Начинщики" -> listOf("Вика (жирная, постоянно жрет и курит, строит мне глазки и проявляет знаки симпатии. фу буээ..", "Новенький (вероятно солевой, прям 70% что не против занюхать пару дорог 'мяу')", "Аня (единственная красивая девушка на весь завод)")
            "Грузчики" -> listOf("Мужик с длинными волосами", "Мужик с короткими волосами", "Молодой пацан")
            "Руководство" -> listOf("Фаина Васильевна (татарка, этим уже все сказанно. ненавидит русских в связи со своим национальным происхождением - это очень важно никогда не забывать)", "Яна (технолог, по совместительству РСП. хорошая как человек, милая и добрая, но такой себе технолог, даже не умеет замерять маргарин при слоении. ей надо увольняться с этого завода как можно быстрее, тк здесь у нее нет будущего)", "Даня (классный чувак и по совместительству хороший технолог)")
            "Слесаря" -> listOf("Илюха (еще 1 из немногих нормальных людей на весь завод)", "Олег (постоянно несет какой-то бред)", "Новенький (умный чел, зря он сюда устроился...)", "Дима (ему вообще похуй на все, что происходит)")
            "Ремесленники" -> listOf("Тощий чурка (возможно ебётся с уборщицой-чуркой. скоро уволится)", "Толстый чурка (заебал не выключать лёд, а когда я его выключаю - он негодует. так же сдал меня однажды горшку. дегенерат ебаный...)")
            "Пекари" -> listOf("Даня (пекарь в моей смене, скоро уволится)", "Миша (ебанутый какой-то, с ним точно что-то не так)", "Саня (Делает вид, что ему все нравится, но мне кажется, он ненавидит этот завод)", "Чупа-чупс (его так называл шизоидный Диман, ничего о нем не знаю)")
            "Кондитера" -> listOf("Максим (иногда генерит кринжовые шутки, но чел добрый и позитивный)", "Бабка-чурка (всё время ебет мне мозг что Рая взяла свежую начинку вместо старой)")
            "Старшие смены" -> listOf("Оксана (хотя она даже и не старший смены по факту)", "Какая-та баба в смене Миши (знаю только, что она дико боится Фаю.)", "Паша (прямо сейчас читает эту херню, на которую я убил весь выходной день, вместо того, чтобы набухаться и снимать чат-рулетку)")
            else -> listOf("Пожалуйста, выберите интересующее вас подразделение производства", "Спасибо.")
        }
    }
}