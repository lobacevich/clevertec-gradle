<h2>Task</h2>
<ol>
<li>Установить <strong>Gradle</strong></li>
<li>Проект должен быть совместим с <strong>java 17</strong></li>
<li>Создать файл .jar</li>
<li>Манифест файл должен содержать имя и версию .jar файла</li>
<li>В .jar файле должен быть class <strong>StringUtils</strong> с методом 
<strong>boolean isPositiveNumber(String str)</strong></li>
<li>Написать один <strong>unit test</strong> для проверки этого метода 
(использовать <strong>JUnit 5</strong>)</li>
</ol>
<h2>Дополнительно:</h2>
<ol>
<li>Сделать <strong>gradle плагин</strong>, который также опубликовать и 
подключить к проекту, например плагин по формированию отчета</li>
<li>Создать мульти-модульный проет с двумя модулями: <strong>core, api</strong></li>
<li>В модуле vcore должен быть class Utils с методом <strong>boolean 
isAllPositiveNumbers(String... str)</strong></li>
<li>Использовать .jar файл, сделанный на предыдущих этапах, для возможности 
переиспользовать метод <strong>boolean isAllPositiveNumbers(String... str)</strong> в 
модуле <strong>core</strong></li>
<li>В модуле <strong>api</strong> должен быть <strong>class App</strong> с методом 
<strong>main</strong></li>
<li>Из модуля <strong>api</strong> в методе <strong>main</strong> вызвать <strong>
Utils.isAllPositiveNumbers("12", "79")</strong></li>
<li>Написать один <strong>unit test</strong> для проверки этого метода <strong>boolean 
isAllPositiveNumbers(String... str)</strong>(использовать <strong>JUnit 5</strong>)</li>
</ol>