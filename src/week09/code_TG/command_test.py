import tkinter as tk


def light_on():
    lbl_light_info.config(text='전등 ON!')


def light_off():
    lbl_light_info.config(text='전등 OFF~')


w = tk.Tk()
w.geometry('300x150')
w.title("커맨드 패턴")

lbl_light_info = tk.Label(w, text='전등 상태 모니터링')
btn_light_on = tk.Button(w, text='전등 켜기', command=light_on)
btn_light_off = tk.Button(w, text='전등 끄기', command=light_off)
lbl_light_info.pack()
btn_light_on.pack(fill='x')
btn_light_off.pack(fill='x')

w.mainloop()
