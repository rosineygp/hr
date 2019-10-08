function staircase(n) {
  let str = ""
  for (let i = 1; i <= n; i++) {
    console.log(str.padStart((n - i), " ") + str.padEnd(i, "#"))
  }
}

staircase(6)
staircase(20)

staircase(200)