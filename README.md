1. Метод `calculateAk`:
  - Назначение: Вычисляет коэффициенты 𝐴𝑘 для тригонометрической интерполяции.
  - Как работает: Метод принимает массив значений функции 𝑓 и количество точек 𝑁. Для каждого 𝑘 он вычисляет сумму произведений значений функции на косинусы с соответствующими частотами, а        затем делит эту сумму на 𝑁, чтобы получить коэффициенты 𝐴𝑘.
2. Метод `calculateBk`:
  - Назначение: Вычисляет коэффициенты 𝐵𝑘 для тригонометрической интерполяции.
  - Как работает: Этот метод аналогичен calculateAk, но вместо косинусов используется синусы. Результирующие коэффициенты 𝐵𝑘 определяют синусоидальную часть интерполяционной функции.
3. Метод `calculateT`:
  - Назначение: Вычисляет значение тригонометрической интерполяционной функции T(x) в заданной точке 𝑥.
  - Как работает: Используя ранее вычисленные массивы коэффициентов 𝐴𝑘 и 𝐵𝑘, метод суммирует соответствующие косинусоидальные и синусоидальные члены для вычисления значения функции T(x) в        конкретной точке 𝑥.
Пример использования:
В методе main создаются массивы значений функции в нескольких точках, вычисляются коэффициенты 𝐴𝑘 и 𝐵𝑘, и затем рассчитывается значение интерполяционной функции T(x) в выбранной точке x=𝜋/4. Результат выводится на экран.
Формула для вычисления коэфициента
