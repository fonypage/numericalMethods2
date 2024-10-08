### Тригонометрическая интерполяция

Тригонометрическая интерполяция — это метод интерполяции функции, основанный на разложении функции в тригонометрический ряд (синусы и косинусы) для равномерно распределённых точек на интервале [0,2pi]. Основная задача интерполяции заключается в нахождении тригонометрической функции T(x), которая проходит через все заданные точки.

Интерполяционная функция T(x) выражается в виде:

![image](https://github.com/user-attachments/assets/be12cddd-ae47-4516-9009-2ddfab15cb97)


где:
- Ak — коэффициенты при косинусах,
- Bk — коэффициенты при синусах,
- k — порядок гармоники,
- x — аргумент функции, на котором вычисляется её значение.

### Вычисление коэффициентов

Для того чтобы интерполяционная функция точно проходила через заданные значения функции f(x) в равномерно распределённых точках xj =2pi*j/N, коэффициенты Ak и Bk вычисляются следующим образом:

1. **Коэффициенты Ak**:
   ![image](https://github.com/user-attachments/assets/b490919c-5bc9-46c6-93fe-aa32950b458b)
   где:
   - fj — значения функции в точках xj,
   - N — количество точек интерполяции.

2. **Коэффициенты Bk**:
   ![image](https://github.com/user-attachments/assets/5d6b7b70-bdcf-4bba-b59b-ebf1728dc56d)

   Этот коэффициент описывает синусоидальную составляющую интерполяционной функции.

### Значение интерполяционной функции

После вычисления коэффициентов Ak и Bk, значение интерполяционной функции T(x) в любой точке x может быть найдено с помощью формулы:

![image](https://github.com/user-attachments/assets/9e4aed3f-14df-4f44-b0b3-d99d6303d4ee)


Здесь член A0/2 соответствует постоянной составляющей ряда (среднее значение функции).
