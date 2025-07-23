def bubble_sort(arr):
  for i in enumerate(arr, start=1):
    if i == (len(arr)):
      break
    for j, x in enumerate(arr):
      if j == (len(arr) - 1):
        break
      if x > arr[j + 1]:
        temp = arr[j + 1]
        arr[j + 1] = x
        arr[j] = temp
  print(arr)


bubble_sort([2,3,1,24,84,6,3,99,55])