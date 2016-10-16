        function getTopFive() {
          goalListViewModel.wishList().sort(sortWish)
          return goalListViewModel.wishList().slice(0, 4)
        }

        function sortWish(a, b) {
          return a.wishOrigin().numberalpha - b.wishOrigin().numberalpha;
        }

                          function calAvg() {
                            var departmentAvgs = [];
                            for (var i = 0; i < goalListViewModel.wishList().length; i++) {
                              if (departmentAvgs.length !== 0) {
//            部门信息列表不为空，循环比较部门信息
                                for (var j = 0; j < departmentAvgs.length; j++) {

                                  if (goalListViewModel.wishList()[i].wishOrigin().stringalpha === departmentAvgs[j].department) {
                                    //部门信息已存在
                                    departmentAvgs[j].sum += goalListViewModel.wishList()[i].wishOrigin().numberalpha;
                                    departmentAvgs[j].number++;
                                  } else {
                                    //部门信息不存在, 则新建一个并push到列表中
                                    var departmentAvg = {
                                      department: goalListViewModel.wishList()[i].wishOrigin().stringalpha,
                                      sum: goalListViewModel.wishList()[i].wishOrigin().numberalpha,
                                      number: 1,
                                      avg: 0
                                    };
                                    departmentAvgs.push(departmentAvg);
                                  }
                                }
                              } else {
                                //部门信息为空，先push一个入列表，只在第一个循环用到
                                var departmentAvg = {
                                  department: goalListViewModel.wishList()[i].wishOrigin().stringalpha,
                                  sum: goalListViewModel.wishList()[i].wishOrigin().numberalpha,
                                  number: 1,
                                  avg: 0
                                };
                                departmentAvgs.push(departmentAvg);
                                console.log(departmentAvgs)
                              }
                            }

//计算平均数
                            for (var j = 0; j < departmentAvgs.length; j++) {
                              departmentAvgs[j].avg = departmentAvgs[j].sum / departmentAvgs[j].number;
                            }

                            return departmentAvgs;
                          }