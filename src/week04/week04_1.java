package week04;

public class week04_1 {
    static int x=5, y=16;

    public static void main(String[] args) {
        char c1 = 'b', c2 = 'y';
        String s1 = "dlwlrma";
        String s2 = "dlwlrma";
        String s3 = new String("dlwlrma");
        String s4 = new String("dlwlrma");

        System.out.println(c1 == c2);
        System.out.println(s1 == s2);
        System.out.println(c1 < c2);
        System.out.println(s3 == s4);
        System.out.println(5>16);
        System.out.println(5!=16);
    }
}

/* 주피터
# decorator

def description(f):
    def inner(*args):    # 설명도 나오도록 만듦
        print(f.__doc__)
        r = f(*args)
        return r
    return inner

def squares(n):
    """
    제곱함수
    """
    return n * n


@description
def power(b,e):
    """
    거듭제곱 함수
    """
    result = 1
    for _ in range(e) :
        result  = result * b
    return result

f1 = description(squares)
print(f1(9))

print(power(2, 10))
*/

/* 주피터 - 래핑 코드(파이썬)
def with_milk(f):
    def wrapper(*args):
        coffee = f(*args)
        return Coffee(f"{coffee.description} (우유 추가)",coffee.cost + 100)
    return wrapper

def with_mocha(f):
    def wrapper(*args):
        coffee = f(*args)
        return Coffee(f"{coffee.description} (모카 추가)",coffee.cost + 200)
    return wrapper

# 데코레이터 ↑

class Coffee :
    def __init__(self, description, cost):
        self.description = description
        self.cost = cost

    def __repr__(self):
        return f"{self.description} ({self.cost}원)"

# print(Coffee("에스프레소", 2000))

@with_milk
@with_mocha
def espresso() :
    return Coffee("에스프레소", 2000)

@with_mocha
def decaf() :
    return Coffee("디카페인", 2700)

print(espresso()) # 에스프레서 + 모카 + 우유
print(decaf())    # 디카페인 + 모카

*/